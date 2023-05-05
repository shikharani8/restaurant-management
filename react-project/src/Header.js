import React from 'react';
import {navItems} from './Config';
import { FaShoppingBag } from "react-icons/fa";

const Header = (props) => {
  const cartItems = props.cartItems;
  const items = props.items;
  const cartData = [];
  for(const key of Object.keys(cartItems)) {
    for(const item of items) {
      if(item.id==key) {
        item['count'] = cartItems[key];
        cartData.push(item);
      }
    }
  }
  console.log(cartData);
  return (
    <nav class="navbar navbar-expand-lg navbar-light navbar-dark bg-dark">
      <ul class="navbar-nav mr-auto">
        {navItems.map (item => {
          return (
           <div><li class="nav-item active">
           <a class="btn btn-dark" href={item.path}>{item.title}</a>
           
       </li>

       <FaShoppingBag textDecoration={cartData.length} 
       style={{color: 'white', fontSize: '30px', float: 'right'}} />
       <span class='badge badge-warning' id='lblCartCount'> {cartData.length} </span></div>
          );
        })}

      </ul>
    </nav>
  )
}

export default Header;
