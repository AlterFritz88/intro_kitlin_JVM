class SimplePersonFormatter : PersonFormatter {
    override fun format(person: Person?): String {

        if(person == null) {
            return ""
        }

        val name = person.name.capitalize()


        val address = person.address ?: return name

        val city = address.city.capitalize()
        val street = address.street?.toUpperCase()

        return if(street == null) {
            "$name ($city)"
        } else {
            "$name ($city, ул. $street)"
        }
    }
}