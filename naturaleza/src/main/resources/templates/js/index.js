const listaDomicilio = document.getElementById("lista-domicilio");
const obtenerDomicilio = () => {
    fetch("http://localhost:8080/listar")
        .then(response => response.json())
        .then(data => {
            data.forEach(domicilio => {
                const li = document.createElement("li");
                li.textContent = domicilio.direccion;
                listaDomicilio.appendChild(li);
                console.log(`Código: ${domicilio.codigo} - Dirección: ${domicilio.direccion}`);
            });
        })
        .catch(error => console.error('Error:', error));
}
window.onload = obtenerDomicilio;

const form = document.getElementById("form");
form.addEventListener('submit', (e) => {
    e.preventDefault();
    //console.log(document.getElementById("modelo").value);
    const auto = {
        "modelo": document.getElementById("modelo").value,
        "patente": document.getElementById("patente").value
    }
    // console.log(auto);
    fetch("http://localhost:8080/crearAuto", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(auto)
    }).then(
        response => response.json()
    ).then(data => {
        console.log("uto guardado ", data)
    })
        .catch(error => console.error('Error:', error))
});