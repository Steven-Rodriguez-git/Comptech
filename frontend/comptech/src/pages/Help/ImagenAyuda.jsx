import React from "react";
import Container from "react-bootstrap/esm/Container";
import Image from 'react-bootstrap/Image';



function MainImage () {
  return (
    <React.Fragment>
      <Container fluid style={{padding:"0"}}>   
        <Image fluid src="/imageHeader.jpg" alt="src"/>
      </Container>
    </React.Fragment>
  );
};

export default MainImage;
