import React from "react";
import Container from "react-bootstrap/esm/Container";
import Image from 'react-bootstrap/Image';



function MainImage () {
  return (
    <React.Fragment>
      <Container fluid style={{padding:"0"}}>   
        <Image fluid src="/logo512.png" alt="src"/>
      </Container>
    </React.Fragment>
  );
};

export default MainImage;
