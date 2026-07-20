import React from "react";

function CourseDetails() {

    const courses = [

        {
            id: 1,
            name: "React",
            duration: "2 Months"
        },

        {
            id: 2,
            name: "Angular",
            duration: "3 Months"
        },

        {
            id: 3,
            name: "Node JS",
            duration: "2.5 Months"
        }

    ];

    return (

        <div>

            <h2>Course Details</h2>

            <table border="1">

                <thead>

                    <tr>

                        <th>Course</th>
                        <th>Duration</th>

                    </tr>

                </thead>

                <tbody>

                    {courses.map((course) => (

                        <tr key={course.id}>

                            <td>{course.name}</td>
                            <td>{course.duration}</td>

                        </tr>

                    ))}

                </tbody>

            </table>

        </div>

    );

}

export default CourseDetails;