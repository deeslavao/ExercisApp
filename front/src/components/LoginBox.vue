<template>
  <form id ="LoginForm">
    <input type="email">
    <input type="password">
    <div id = "LoginButtons">
      <button id="aceptar">
        Iniciar Secion
      </button>
      <button id="registrar">
        Registrarse
      </button>
    </div>
  </form>
</template>

<script>
export default {

}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Josefin+Sans&family=Road+Rage&display=swap');
button {
  display:block;
  margin: 1rem auto;
  padding: 0.7rem 3rem;
  border-radius: 0.3rem;
  border: 0;
  color: #FFFBF4;
  font-family: 'Josefin Sans', sans-serif;
}

#LoginForm {
    box-shadow: 0 0.65rem 1rem rgba(0,0,0,1);
    background-color: #FFFBF4;
    border-radius: 0.5rem;
    padding: 1rem 0rem;
    display: block;
    width: 15rem;
    margin-left: 60rem;
    margin-top: -23rem;
}

#LoginForm input {
  height: 1.5rem;
  background-color: #DBDBDB;
  margin: 1rem 0;
  border-radius: 0.2rem;
  border-color: #DBDBDB;
  border: 0;
}

#LoginButtons #aceptar {
  background-color: #08C0FF;
}

#LoginButtons #registrar {
  background-color: #D71400;
}
</style>
