import Vue from "vue";
import VueRouter from "vue-router";
import LoginPage from "@/pages/LoginPage.vue";
import RegisterPage from "@/pages/RegisterPage.vue";
import UserProfile from "@/pages/UserProfile.vue";
import LandingPage from "@/pages/LandingPage.vue"
import Trails from "@/pages/TrailList.vue";

Vue.use(VueRouter);

const routes = [
    { path: "/" , component: LandingPage },
    { path: "/login", component: LoginPage },
    { path: "/register", component: RegisterPage },
    { path: "/user/:id", component: UserProfile },
    { path: "/trails", component: Trails },
];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
});

export default router;
