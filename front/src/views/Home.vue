<template>
  <div class="home">
    <div id = "logo">
      <h1>Heracles</h1>
      <h2>Retis</h2>
      <p> Aqui iria mi slogan si tuviera uno UwU </p>
    </div>
    <LoginBox/>
  </div>
</template>

<script>
import LoginBox from '@/components/LoginBox.vue'
export default {
  name: 'Home',
  components: {
    LoginBox
  }
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Josefin+Sans&family=Road+Rage&display=swap');
.home {
  float: left;
  display: inline;
}

#logo {
  margin: 10rem 0;
  color : #FFFBF4;
}

#logo h1 {
  margin: 0;
  padding: 0.1rem;
  display: inline;
  font-weight: 500;
  letter-spacing: 0.2rem;
  font-family: 'Road Rage', cursive;
  font-size: 8rem;
}

#logo h2 {
  margin: 0;
  padding: 0.1rem;
  display: inline;
  font-size: 0.8rem;
}

#logo p{
  font-family: 'Josefin Sans', sans-serif;
  font-size: 25px;
}

</style>
