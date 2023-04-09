# Use the official Node.js image as the base image for the build stage
FROM node:14 AS build-stage

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the project files to the working directory
COPY . .

# Build the Vue.js application for production
RUN npm run build

# Use the official Nginx image for the production stage
FROM nginx:1.21

# Copy the built frontend files to the Nginx container
COPY --from=build-stage /app/dist /usr/share/nginx/html

# Expose the default Nginx port
EXPOSE 80
