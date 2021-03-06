class Employee private constructor(var builder: Builder) {
    var firstName: String = ""
    var lastName: String = ""
    var id: String = ""
    var managerId: String = ""
    var isManager: Boolean = false

    init {
        this.firstName = builder.firstName
        this.id = builder.id
        this.isManager = builder.isManager
        this.managerId = builder.managerId
        this.lastName = builder.lastName
    }

    class Builder {
        var firstName: String = ""
        var lastName: String = ""
        var id: String = ""
        var managerId: String = ""
        var isManager: Boolean = false


        fun build(): Employee {
            return Employee(this)

        }

        fun setFirstName(fName: String) = apply { this.firstName = fName }
        fun setId(Id: String) = apply { this.id = Id }
        fun setManagerId(managerId: String) = apply { this.managerId = managerId }
        fun setIsManager(isManager: Boolean) = apply { this.isManager = isManager }
        fun setLstName(lName: String) = apply { this.lastName = lName }

    }

}

fun main() {
    var employee = Employee.Builder()
        .setFirstName("lool")
        .setLstName("aladimi")
        .setId("1")
        .setManagerId("101")
        .setIsManager(false)
    println(employee.firstName)
    println(employee.lastName)
    println(employee.id)
    println(employee.managerId)


}