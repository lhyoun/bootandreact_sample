import React from 'react';
import { Route } from 'react-router-dom';
import LoginForm from './pages/user/LoginForm';
import Header from './components/Header';
import MainForm from './pages/MainForm';
import JoinForm from './pages/user/JoinForm';

const App = () => {
  return (
    <div>
      {/* <LoginForm></LoginForm> */}
      <Header></Header>
      {/* 로그인 페이지 */}
      <Route path="/" exact={true} component={MainForm}></Route>
      <Route path="/Login" exact={true} component={LoginForm}></Route>
      <Route path="/Join" exact={true} component={JoinForm}></Route>

    </div>
  );
};

export default App;