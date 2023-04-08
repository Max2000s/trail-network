import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080', // Replace with the address of your Spring Boot backend
});

export default api;
