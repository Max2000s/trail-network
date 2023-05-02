<template>


    <div>
        <header>
            <!-- Header content, such as logo and navigation -->
        </header>

        <main>
            <!-- Main content, such as hero image and text -->
            <section class="hero">
                <h1>Welcome to TrailNetwork</h1>
                <p>Connect with mountain bikers and discover new trails!</p>
                <button @click="goToRegister">Join Now</button>
            </section>
        </main>

        <footer>
            <!-- Footer content, such as copyright and social media links -->
        </footer>
    </div>
</template>

<script>
export default {
    methods: {
        goToRegister() {
            this.$router.push('/register');
        },
    },
};
</script>