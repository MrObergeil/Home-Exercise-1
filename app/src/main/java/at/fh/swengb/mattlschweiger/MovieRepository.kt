package at.fh.swengb.mattlschweiger

object MovieRepository {
    val movies: List<Movie>

    init {
        val robertoBenigni = Person("Roberto Benigni", "27.10.1952")
        val nicolettaBraschi = Person("Nicoletta Braschi", "19.4.1960")
        val francoisCluzet = Person("François Cluzet","21.10.1955")
        val omarSy = Person("Omar Sy","20.1.1978")
        val olivierNakache = Person("Olivier Nakache", "15.4.1973")
        val alPacino = Person("Al Pacino", "25.4.1940")
        val deNiro = Person("Robert De Niro", "17.8.1943")
        val francisFordCoppola = Person("Francis Ford Coppula", "17.4.1939")
        val marlonBrando = Person("Marlon Brando", "3.4.1924")
        val frankDarabont = Person("Frank Darabont", "28.1.1959")
        val timRobbins = Person("Tim Robbins", "16.10.1958")
        val morganFreeman = Person("Morgan Freeman", "1.7.1937")
        val spielberg = Person("Stephen Spielberg", "18.12.1946")
        val liamNeeson = Person("Liam Neeson", "7.7.1952")
        val benKingsley = Person("Ben Kingsley", "31.12.1943")
        val milosForeman = Person("Milos Foreman", "18.2.1932")
        val jackNicholson = Person("Jack Nicholson", "22.4.1937")
        val louiseFletcher = Person("Louise Fletcher", "22.7.1934")
        val christopherNolan = Person("Christopher Nolan", "30.7.1970")
        val christianBale = Person("Christian Bale", "30.1.1974")
        val heathLedger = Person("Heath Ledger", "4.4.1979")
        val peterJackson = Person("Peter Jackson", "31.8.1961")
        val elijahWood = Person("Elijah Wood", "28.1.1981")
        val ianMcKellen = Person("Ian McKellen", "25.5.1939")
        val diCaprio = Person("Leonardo DiCaprio", "11.11.1974")
        val ellenPage = Person("Ellen Page", "21.2.1987")
        val robertZemicks = Person("Robert Zemicks", "14.5.1951")
        val tomHanks = Person("Tom Hanks", "9.7.1656")
        val robinWright = Person("Robin Wright", "8.4.1966")
        val darrenAronofsky = Person("Darren Aronofsky", "12.2.1969")
        val guyPearce = Person("Guy Pearce", "5.10.1967")
        val joePantoliano = Person("Joe Pantoliano", "12.9.1951")
        val ellenBurstyn = Person("Ellen Burstyn", "7.12.1932")
        val jaredLeto = Person("Jared Leto", "26.12.1971")
        val quentinTarentino = Person("Quentin Tarentino","27.4.1963")
        val umaThurman = Person("Uma Thurman","29.4.1970")
        val davidCarradine = Person("David Carradine","8.10.1936")
        val stanleyKubrick = Person("Stanley Kubrick","26.7.1928")
        val malcomMcDowell = Person("Malcom McDowell", "13.6.1943")
        val patrickMagee = Person("Patrick Magee", "31.3.1922")
        val bradPitt = Person("Brad Pitt","18.10.1963")
        val dianeKruger = Person("Diane Kruger", "15.7.1976")
        val wesAnderson = Person("Wes Anderson", "1.5.1969")
        val ralphFiennes = Person("Ralph Fiennes", "22.12.1962")
        val fMurrayAbraham = Person("F.Murray Abraham", "24.10.1939")

        movies = listOf(
            Movie(id = "0",
                title = "La vita è bella",
                release = "1997",
                plot = "When an open-minded Jewish librarian and his son become victims of the Holocaust, he uses a perfect mixture of will, humor, and imagination to protect his son from the dangers around their camp.",
                genre = MovieGenre.DRAMA,
                director = robertoBenigni,
                actors = mutableListOf(robertoBenigni,nicolettaBraschi)
                ),
            Movie(id = "1",
                title = "The Intouchables",
                release = "2011",
                plot = "After he becomes a quadriplegic from a paragliding accident, an aristocrat hires a young man from the projects to be his caregiver.",
                genre = MovieGenre.COMEDY,
                director = olivierNakache,
                actors = mutableListOf(francoisCluzet,omarSy)
            ),
            Movie(id = "2",
                title = "The Godfather",
                release = "1972",
                plot = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                genre = MovieGenre.DRAMA,
                director = francisFordCoppola,
                actors = mutableListOf(marlonBrando, alPacino)
            ),
            Movie(id = "2",
                title = "The Shawshank Redemption",
                release = "1994",
                plot = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                genre = MovieGenre.DRAMA,
                director = frankDarabont,
                actors = mutableListOf(timRobbins, morganFreeman)
            ),
            Movie(
                id = "3",
                title = "Schindlers List",
                release = "1993",
                plot = "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.",
                genre = MovieGenre.DRAMA,
                director = spielberg,
                actors = mutableListOf(liamNeeson, benKingsley)
            ),
            Movie(
                id = "4",
                title = "One Flew Over The Cuckoos Nest",
                release = "1975",
                plot = "A criminal pleads insanity and is admitted to a mental institution, where he rebels against the oppressive nurse and rallies up the scared patients.",
                genre = MovieGenre.DRAMA,
                director = milosForeman,
                actors = mutableListOf(jackNicholson, louiseFletcher)
            ),
            Movie(
                id = "5",
                title = "The Dark Knight Rises",
                release = "2008",
                plot = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice",
                genre = MovieGenre.ACTION,
                director = christopherNolan,
                actors = mutableListOf(christianBale, heathLedger)
            ),
            Movie(
                id = "6",
                title = "The Lord of the Rings: The Return of the King",
                release = "2003",
                plot = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                genre = MovieGenre.DRAMA,
                director = peterJackson,
                actors = mutableListOf(elijahWood, ianMcKellen)
            ),
            Movie(
                id = "7",
                title = "Inception",
                release = "2010",
                plot = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                genre = MovieGenre.ACTION,
                director = christopherNolan,
                actors = mutableListOf(diCaprio, ellenPage)
            ),
            Movie(
                id = "8",
                title = "Forest Gump",
                release = "1994",
                plot = "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75.",
                genre = MovieGenre.DRAMA,
                director = robertZemicks,
                actors = mutableListOf(tomHanks, robinWright)
            ),
            Movie(
                id = "9",
                title = "Memento",
                release = "2000",
                plot = "A man with short-term memory loss attempts to track down his wife's murderer.",
                genre = MovieGenre.DRAMA,
                director = christopherNolan,
                actors = mutableListOf(guyPearce,joePantoliano)
            ),
            Movie(
                id = "10",
                title = "Requiem for a Dream",
                release = "2000",
                plot = "The drug-induced utopias of four Coney Island people are shattered when their addictions run deep.",
                genre = MovieGenre.DRAMA,
                director = darrenAronofsky,
                actors = mutableListOf(ellenBurstyn,jaredLeto)
            ),
            Movie(
                id = "11",
                title = "Kill Bill: Vol. 1",
                release = "2003",
                plot = "After awakening from a four-year coma, a former assassin wreaks vengeance on the team of assassins who betrayed her.",
                genre = MovieGenre.ACTION,
                director = quentinTarentino,
                actors = mutableListOf(umaThurman, davidCarradine)
            ),
        Movie(
            id = "12",
            title = "A Clockwork Orange",
            release = "1971",
            plot = "In the future, a sadistic gang leader is imprisoned and volunteers for a conduct-aversion experiment, but it doesn't go as planned.",
            genre = MovieGenre.DRAMA,
            director = stanleyKubrick,
            actors = mutableListOf(malcomMcDowell, patrickMagee)
            ),
        Movie(
            id = "13",
            title = "Inglorius Basterds",
            release = "2009",
            plot = "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.",
            genre = MovieGenre.ACTION,
            director = quentinTarentino,
            actors = mutableListOf(bradPitt, dianeKruger)
        ),
        Movie(
            id = "14",
            title = "The Grand Budapest Hotel",
            release = "2014",
            plot = "The adventures of Gustave H, a legendary concierge at a famous hotel from the fictional Republic of Zubrowka between the first and second World Wars, and Zero Moustafa, the lobby boy who becomes his most trusted friend.",
            genre = MovieGenre.COMEDY,
            director = wesAnderson,
            actors = mutableListOf(ralphFiennes, fMurrayAbraham)
        )
        )
    }

    fun findMovieById(id: String): Movie? = movies.find{it.id == id}

    fun rateMovie(id: String, rating: Review) = findMovieById(id)?.reviews?.add(rating)
}