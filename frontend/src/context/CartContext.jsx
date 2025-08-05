import React, { createContext, useContext, useState, useEffect } from 'react';

const CartContext = createContext();

export const useCart = () => useContext(CartContext);

export const CartProvider = ({ children }) => {
    const [cart, setCart] = useState(() => {
        const storedCart = localStorage.getItem("cart");
        return storedCart ? JSON.parse(storedCart) : [];
    });

    // Save to localStorage when cart changes
    useEffect(() => {
        localStorage.setItem("cart", JSON.stringify(cart));
    }, [cart]);

    const addToCart = (product, quantity) => {
        setCart(prevCart => {
            const existingIndex = prevCart.findIndex(item => item.pid === product.pid);
            if (existingIndex !== -1) {
                const updatedCart = [...prevCart];
                updatedCart[existingIndex] = { ...product, quantity };
                return updatedCart;
            } else {
                return [...prevCart, { ...product, quantity }];
            }
        });
    };

    const clearCart = () => {
        setCart([]);
        localStorage.removeItem("cart"); // clear from localStorage too
    };

    return (
        <CartContext.Provider value={{ cart, addToCart, clearCart }}>
            {children}
        </CartContext.Provider>
    );
};







// import { createContext, useContext, useState } from 'react';

// const CartContext = createContext();

// export const useCart = () => useContext(CartContext);

// export const CartProvider = ({ children }) => {
//     const [cart, setCart] = useState([]);

//     const addToCart = (product, quantity) => {
//         setCart(prevCart => {
//             const existingIndex = prevCart.findIndex(item => item.pid === product.pid);
//             if (existingIndex !== -1) {
//                 const updatedCart = [...prevCart];
//                 updatedCart[existingIndex] = { ...product, quantity }; // ✅ overwrite with latest
//                 return updatedCart;
//             } else {
//                 return [...prevCart, { ...product, quantity }]; // ✅ first time
//             }
//         });
//     };

//     const clearCart = () => {
//         setCart([]);
//     };

//     return (
//         <CartContext.Provider value={{ cart, addToCart }}>
//             {children}
//         </CartContext.Provider>
//     );
// };







// // src/context/CartContext.js
// import { createContext, useContext, useState } from 'react';

// const CartContext = createContext();

// export const useCart = () => useContext(CartContext);

// export const CartProvider = ({ children }) => {
//     const [cart, setCart] = useState([]);

//     const addToCart = (product, quantity) => {
//         const existing = cart.find(item => item.pid === product.pid);
//         if (existing) {
//             setCart(cart.map(item =>
//                 item.pid === product.pid
//                 ? { ...item, quantity: item.quantity + quantity } // ← WRONG: appending
//                 : item
//             ));
//             }
//  else {
//             setCart([...cart, { ...product, quantity }]);
//         }
//     };

//     return (
//         <CartContext.Provider value={{ cart, addToCart }}>
//             {children}
//         </CartContext.Provider>
//     );
// };
