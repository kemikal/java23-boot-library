console.log("Test");

let admin = true

if (admin) {
  let link = document.createElement("a");
link.innerText = "Admin"
link.href="/admin"

document.body.appendChild(link)  
}

