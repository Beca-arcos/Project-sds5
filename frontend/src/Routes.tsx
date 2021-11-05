import Dashboard from "pages/Dashboard";
import Home from "pages/Home";
import { BrowserRouter, Route, Routes } from "react-router-dom";

const Routes2 = () =>{
    return (
        <div>
            <BrowserRouter>
            <Routes>
                <Route path ="/" element={<Home />}>
                </Route>
                <Route path ="/dashboard" element={<Dashboard />} >
                </Route>

            </Routes>
            </BrowserRouter>
        </div>

    );
}

export default Routes2;

