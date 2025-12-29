
function register(){
 fetch("http://localhost:8081/auth/register",{
  method:"POST",
  headers:{ "Content-Type":"application/json" },
  body:JSON.stringify({
   name:name.value,
   email:email.value,
   password:password.value
  })
 }).then(()=>alert("Registered Successfully"));
}

function login(){
 fetch("http://localhost:8081/auth/login",{
  method:"POST",
  headers:{ "Content-Type":"application/json" },
  body:JSON.stringify({
   email:email.value,
   password:password.value
  })
 }).then(res=>res.json())
 .then(data=>{
  localStorage.setItem("token",data.token);
  window.location="products.html";
 });
}

function loadProducts(){
 fetch("http://localhost:8082/products",{
  headers:{
   "Authorization":"Bearer "+localStorage.getItem("token")
  }
 }).then(res=>res.json())
 .then(list=>{
  let ul=document.getElementById("products");
  list.forEach(p=>{
   let li=document.createElement("li");
   li.innerText=p.name+" - ₹"+p.price;
   ul.appendChild(li);
  });
 });
}
