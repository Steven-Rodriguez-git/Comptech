import React from "react";
import Container from "react-bootstrap/esm/Container";
import Cards from "./Cards";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import "../styles/style.css"
import BetterComponents from "./BetterComponents";

const CardsComponents = () => {
  return (
    <React.Fragment>
        
      
      <Container fluid style={{ padding: "80px", backgroundColor: "#e0e0e0"}}>
          <center><h1 className="title">Mejores componentes</h1></center>
          <BetterComponents/>
        <Row>
          {/* <Col>
            <Cards />
          </Col> */}
          {/* <Col>
            <Cards />
          </Col>
          <Col>
            <Cards />
          </Col>
          <Col>
            <Cards />
          </Col> */}
        </Row>
      </Container>
    </React.Fragment>
  );
};

export default CardsComponents;
