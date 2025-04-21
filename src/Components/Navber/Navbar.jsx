import React from 'react'
import './Navbar.css'
import logo from '../../assets/Logo.png'

const Navbar = () => {
  return (
    <nav className='container blue-nav'>
        <img src={logo} alt="logo" className='logo' />
        <ul>
            <li>Home</li>
            <li>clohets</li>
            <li>Introduction</li>
            <li><button className='btn'>Login</button></li>
        </ul>
    </nav>
  )
}

export default Navbar
