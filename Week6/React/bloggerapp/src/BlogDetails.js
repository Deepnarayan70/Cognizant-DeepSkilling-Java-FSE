import React from "react";

function BlogDetails() {

    const blogs = [

        {
            id: 1,
            title: "React Learning",
            author: "John"
        },

        {
            id: 2,
            title: "Installation of React",
            author: "Peter"
        },

        {
            id: 3,
            title: "React vs Angular",
            author: "David"
        }

    ];

    return (

        <div>

            <h2>Blog Details</h2>

            <table border="1">

                <thead>

                    <tr>

                        <th>Title</th>
                        <th>Author</th>

                    </tr>

                </thead>

                <tbody>

                    {blogs.map((blog) => (

                        <tr key={blog.id}>

                            <td>{blog.title}</td>
                            <td>{blog.author}</td>

                        </tr>

                    ))}

                </tbody>

            </table>

        </div>

    );

}

export default BlogDetails;