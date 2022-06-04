import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav'
import Container from 'react-bootstrap/Container'
import NavDropdown from 'react-bootstrap/NavDropdown'

const NavBar = () => {
  return (
    <div>
      <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
        <Container>
          <Navbar.Brand href="#home">Comptech</Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="#features">Novedades</Nav.Link>
              <Nav.Link href="#pricing">Tiendas</Nav.Link>
              <NavDropdown title="Comparar" id="collasible-nav-dropdown">
                <NavDropdown.Item href="#action/3.1">Componentes</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.2">
                  Computadores
                </NavDropdown.Item>
                <NavDropdown.Item href="#action/3.3">
                  Precios
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
            <Nav>
              <Nav.Link href="#deets">Acerca de</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </div>
  );
};

export default NavBar;
