//1.Build a React application to demonstrate JSX and Virtual DOM 

vs code->open terminal
->open cmd from any directory
->npx create-react-app jsx-demo
->cd jsx-demo
->npm start
->open one more terminal from same directory opened before
-> cd jsx-demo 
->code .
replace App.js code with
import { useState } from "react";
function App() {
  const [count, setCount] = useState(0);
  return (
    <div style={{ textAlign: "center", marginTop: "100px" }}>
      <h1>JSX and Virtual DOM Demo</h1>
      <h2>Current Count: {count}</h2>
      <button onClick={() => setCount(count + 1)}>
        Increment
      </button>
    </div>
  );
}

export default App;
---------------------------------------------
//2.Product Listing Page Using React Components 
in app.js 
import React from "react";
import ProductCard from "./ProductCard";

function App() {
  const products = [
    { id: 1, name: "Laptop", price: 50000, category: "Electronics" },
    { id: 2, name: "Mobile", price: 20000, category: "Electronics" },
    { id: 3, name: "Shoes", price: 1500, category: "Fashion" },
  ];

  return (
    <div>
      <h1>Product Listing</h1>

      {products.map((product) => (
        <ProductCard
          key={product.id}
          name={product.name}
          price={product.price}
          category={product.category}
        />
      ))}
    </div>
  );
}

export default App;
//ProductCard.js
import React from "react";

function ProductCard({ name, price, category }) {
  return (
    <div
      style={{
        border: "1px solid black",
        margin: "10px",
        padding: "10px",
      }}
    >
      <h3>{name}</h3>
      <p>Price: ₹{price}</p>
      <p>Category: {category}</p>

      <button onClick={() => alert(`${name} Purchased`)}>
        Buy Now
      </button>
    </div>
  );
}

export default ProductCard;

------------------------------------------
//3.
in app.js
import React, { useState, useMemo } from "react";

export default function App() {
  const [products] = useState([
    { name: "Pen", qty: 10, price: 20 },
    { name: "Book", qty: 5, price: 100 }
  ]);

  const [search, setSearch] = useState("");
  const [dark, setDark] = useState(false);

  const totalValue = useMemo(() => {
    return products.reduce(
      (sum, item) => sum + item.qty * item.price,
      0
    );
  }, [products]);

  const filtered = products.filter((p) =>
    p.name.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div
      style={{
        backgroundColor: dark ? "#222" : "#fff",
        color: dark ? "#fff" : "#000",
        minHeight: "100vh",
        padding: "20px"
      }}
    >
      <h2>Inventory Management</h2>

      <button onClick={() => setDark(!dark)}>
        Toggle Theme
      </button>

      <br />
      <br />

      <input
        type="text"
        placeholder="Search Product"
        value={search}
        onChange={(e) => setSearch(e.target.value)}
      />

      <ul>
        {filtered.map((p, index) => (
          <li key={index}>
            {p.name} - Qty: {p.qty} - ₹{p.price}
          </li>
        ))}
      </ul>

      <h3>Total Value: ₹{totalValue}</h3>
    </div>
  );
}
