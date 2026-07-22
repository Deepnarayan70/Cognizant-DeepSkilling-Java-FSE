import React from "react";
import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

    <div className="container">

      <h1>Blogger Application</h1>

      {showBooks && <BookDetails />}

      {showBlogs ? <BlogDetails /> : <h2>No Blogs Available</h2>}

      {showCourses && <CourseDetails />}

    </div>

  );
}

export default App;