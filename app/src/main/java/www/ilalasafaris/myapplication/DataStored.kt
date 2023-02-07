package www.ilalasafaris.myapplication

object DataStored {
//Todo Check and fix Latin Names
    fun allSpecies(): ArrayList<Birds> {

        val birdList = ArrayList<Birds>()
        val q1 = Birds(
            1,
            "Albatros Atlantic Yellow-nosed",
            "Atlantic Yellow-nosed Albatros",
            "Thalassarche chlororhynchos",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.albatross_atlanticyellownosed_1d
        )
        birdList.add(q1)

        val q2 = Birds(
            2,
            "Albatros Black-browned",
            "Black-browned Albatros",
            "Thalassarche melanophris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.albatross_blackbrowed_1d
        )
        birdList.add(q2)

        val q3 = Birds(
            3,
            "Albatros Indian Yellow-nosed",
            "Indian Yellow-nosed Albatros",
            "Thalassarche carteri",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q3)

        val q4 = Birds(
            4,
            "Albatros Northen Royal ",
            "Northen Royal Albatros",
            "Diomedea sanfordi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q4)

        val q5 = Birds(
            5,
            "Albatros Shy",
            "Shy Albatros",
            "Thalassarche cauta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.albatross_shy_1d
        )
        birdList.add(q5)

        val q6 = Birds(
            6,
            "Albatros Southern Royal",
            "Southern Royal Albatros",
            "Diomedea epomophora",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q6)

        val q7 = Birds(
            7,
            "Albatros Wandering",
            "Wandering Albatros",
            "Diomedea exulans",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.albatross_wondering_1d
        )
        birdList.add(q7)

        val q8 = Birds(
            8,
            "Apalis Bar-throated",
            "Bar-throated Apalis",
            "Apalis thoracica",
            R.drawable.apalis_barthroated_1l,
            R.drawable.apalis_barthroated_2l,
            R.drawable.apalis_barthroated_1l,
            R.drawable.apalis_barthroated_2l,
            R.drawable.apalis_barthroated_1l,
            R.raw.apalis_barthroated_1d
        )
        birdList.add(q8)

        val q9 = Birds(
            9,
            "Apalis Rudd's",
            "Rudd's Apalis",
            "Apalis ruddi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.apalis_rudd_1d
        )
        birdList.add(q9)

        val q10 = Birds(
            10,
            "Apalis Yellow-breasted",
            "Yellow-breasted Apalis",
            "Apalis flavida",
            R.drawable.apalis_yellowbreasted_1l,
            R.drawable.apalis_yellowbreasted_1l,
            R.drawable.apalis_yellowbreasted_1l,
            R.drawable.apalis_yellowbreasted_1l,
            R.drawable.apalis_yellowbreasted_1l,
            R.raw.apalis_yellowbreasted_1d
        )
        birdList.add(q10)

        val q11 = Birds(
            11,
            "Avocet Pied",
            "Pied Avocet",
            "Recurvirostra avosetta",
            R.drawable.avocet_pied_1l,
            R.drawable.avocet_pied_1l,
            R.drawable.avocet_pied_1l,
            R.drawable.avocet_pied_1l,
            R.drawable.avocet_pied_1l,
            R.raw.avocet_pied_1
        )
        birdList.add(q11)

        val q12 = Birds(
            12,
            "Babbler Arrow-marked",
            "Arrow-marked Babbler",
            "Turdoides jardineii",
            R.drawable.babbler_arrowmarked_1j,
            R.drawable.babbler_arrowmarked_2j,
            R.drawable.babbler_arrowmarked_3j,
            R.drawable.babbler_arrowmarked_2j,
            R.drawable.babbler_arrowmarked_1j,
            R.raw.babbler_arrowmarked_1
        )
        birdList.add(q12)

        val q13 = Birds(
            13,
            "Babbler Southern Pied",
            "Southern Pied Babbler",
            "Turdoides bicolor",
            R.drawable.babbler_pied_1j,
            R.drawable.babbler_pied_2j,
            R.drawable.babbler_pied_1j,
            R.drawable.babbler_pied_2j,
            R.drawable.babbler_pied_1j,
            R.raw.babbler_southernpied_1
        )
        birdList.add(q13)

        val q14 = Birds(
            14,
            "Barbet Acacia Pied",
            "Acacia Pied Barbet",
            "Tricholaema leucomelas",
            R.drawable.barbet_acaciapied_1l,
            R.drawable.barbet_acaciapied_1l,
            R.drawable.barbet_acaciapied_1l,
            R.drawable.barbet_acaciapied_1l,
            R.drawable.barbet_acaciapied_1l,
            R.raw.barbet_acaciapied_1
        )

        birdList.add(q14)

        val q15 = Birds(
            15,
            "Barbet Black-collared",
            "Black-collared Barbet",
            "Lybius torquatus",
            R.drawable.barbet_blackcollard_1j,
            R.drawable.barbet_blackcollard_2l,
            R.drawable.barbet_blackcollard_3j,
            R.drawable.barbet_blackcollard_4l,
            R.drawable.barbet_blackcollard_1j,
            R.raw.barbet_crestred_1
        )
        birdList.add(q15)

        val q16 = Birds(
            16,
            "Barbet Crested",
            "Crested Barbet",
            "Trachyphonus vaillantii",
            R.drawable.barbet_crested_1j,
            R.drawable.barbet_crested_2j,
            R.drawable.barbet_crested_3j,
            R.drawable.barbet_crested_4j,
            R.drawable.barbet_crested_5j,
            R.raw.barbet_acaciapied_1
        )
        birdList.add(q16)

        val q17 = Birds(
            17,
            "Barbet Green",
            "Green Barbet",
            "Buccanodon duchaillui",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q17)

        val q18 = Birds(
            18,
            "Barbet White-eared",
            "White-eared Barbet",
            "Stactolaema leucotis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q18)

        val q19 = Birds(
            19,
            "Bateleur",
            "Bateleur",
            "Terathopius ecaudatus",
            R.drawable.bataleur_1j,
            R.drawable.bataleur_2j,
            R.drawable.bataleur_3j,
            R.drawable.bataleur_4j,
            R.drawable.bataleur_5j,
            R.raw.nocall
        )
        birdList.add(q19)

        val q20 = Birds(
            20,
            "Batis Cape",
            "Cape Batis",
            "Batis capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q20)

        val q21 = Birds(
            21,
            "Batis Chinspot",
            "Chinspot Batis",
            "Batis molitor",
            R.drawable.batis_chinspot_1j,
            R.drawable.batis_chinspot_2j,
            R.drawable.batis_chinspot_3j,
            R.drawable.batis_chinspot_4j,
            R.drawable.batis_chinspot_5j,
            R.raw.nocall
        )
        birdList.add(q21)

        val q22 = Birds(
            22,
            "Batis Pririt",
            "Pririt Batis",
            "Batis pririt",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q22)

        val q23 = Birds(
            23,
            "Batis Woodwards",
            "Woodwards Batis",
            "Batis fratrum",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q23)

        val q24 = Birds(
            24,
            "Bee-eater Blue-cheeked",
            "Blue-cheeked Bee-eater",
            "Merops persicus",
            R.drawable.beeeater_bluecheeked_1l,
            R.drawable.beeeater_bluecheeked_1l,
            R.drawable.beeeater_bluecheeked_1l,
            R.drawable.beeeater_bluecheeked_1l,
            R.drawable.beeeater_bluecheeked_1l,
            R.raw.nocall
        )
        birdList.add(q24)

        val q25 = Birds(
            25,
            "Bee-eater European",
            "European Bee-eater",
            "Merops apiaster",
            R.drawable.beeeater_european_1j,
            R.drawable.beeeater_european_2j,
            R.drawable.beeeater_european_3j,
            R.drawable.beeeater_european_4j,
            R.drawable.beeeater_european_5j,
            R.raw.nocall
        )
        birdList.add(q25)

        val q26 = Birds(
            26,
            "Bee-eater Little",
            "Little Bee-eater",
            "Merops pusillus",
            R.drawable.beeeater_little_1j,
            R.drawable.beeeater_little_2j,
            R.drawable.beeeater_little_3j,
            R.drawable.beeeater_little_4j,
            R.drawable.beeeater_little_1j,
            R.raw.nocall
        )
        birdList.add(q26)

        val q27 = Birds(
            27,
            "Bee-eater Southern Carmine",
            "Southern Carmine Bee-eater",
            "Merops nubicoides",
            R.drawable.beeeater_carmine_1j,
            R.drawable.beeeater_carmine_2j,
            R.drawable.beeeater_carmine_3j,
            R.drawable.beeeater_carmine_4j,
            R.drawable.beeeater_carmine_5j,
            R.raw.nocall
        )
        birdList.add(q27)

        val q28 = Birds(
            28,
            "Bee-eater Swallow-tailed",
            "Swallow-tailed Bee-eater",
            "Merops hirundineus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q28)

        val q29 = Birds(
            29,
            "Bee-eater White-fronted",
            "White-fronted Bee-eater",
            "Merops bullockoides",
            R.drawable.beeeater_whitefronted_1j,
            R.drawable.beeeater_whitefronted_2j,
            R.drawable.beeeater_whitefronted_3j,
            R.drawable.beeeater_whitefronted_4j,
            R.drawable.beeeater_whitefronted_5j,
            R.raw.nocall
        )
        birdList.add(q29)

        val q30 = Birds(
            30,
            "Bishop Southern Red",
            "Southern Red Bishop",
            "Euplectes orix",
            R.drawable.bishop_southernred_1l,
            R.drawable.bishop_southernred_2l,
            R.drawable.bishop_southernred_3l,
            R.drawable.bishop_southernred_4l,
            R.drawable.bishop_southernred_1l,
            R.raw.nocall
        )
        birdList.add(q30)

        val q31 = Birds(
            31,
            "Bishop Yellow",
            "Yellow Bishop",
            "Ploceus flavipes",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q31)

        val q32 = Birds(
            32,
            "Bishop Yellow-crowned",
            "Yellow-crowned Bishop",
            "Ploceus katangae",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q32)

        val q33 = Birds(
            33,
            "Bittern Dwarf",
            "Dwarf Bittern",
            "Ixobrychus sturmii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q33)

        val q34 = Birds(
            34,
            "Bittern Little",
            "Little Bittern",
            "Ixobrychus minutus",
            R.drawable.bittern_little_1l,
            R.drawable.bittern_little_1l,
            R.drawable.bittern_little_1l,
            R.drawable.bittern_little_1l,
            R.drawable.bittern_little_1l,
            R.raw.nocall
        )
        birdList.add(q34)

        val q35 = Birds(
            35,
            "Blackcap Bush",
            "Bush Blackcap",
            "Chlorophoneus nigrifrons",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q35)

        val q36 = Birds(
            36,
            "Bokmakierie",
            "Bokmakierie",
            "Telophorus zeylonus",
            R.drawable.bokmakierie_1l,
            R.drawable.bokmakierie_1l,
            R.drawable.bokmakierie_1l,
            R.drawable.bokmakierie_1l,
            R.drawable.bokmakierie_1l,
            R.raw.nocall
        )
        birdList.add(q36)

        val q37 = Birds(
            37,
            "Booby Brown",
            "Brown Booby",
            "Sula leucogaster",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q37)

        val q38 = Birds(
            38,
            "Booby Masked ",
            "Masked Booby",
            "Sula dactylatra",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q38)

        val q39 = Birds(
            39,
            "Booby Red-fronted",
            "Red-fronted Booby",
            "Sula sula",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q39)

        val q40 = Birds(
            40,
            "Boubou Southern",
            "Southern Boubou",
            "Laniarius ferrugineus",
            R.drawable.boubou_southern_1l,
            R.drawable.boubou_southern_2l,
            R.drawable.boubou_southern_1l,
            R.drawable.boubou_southern_2l,
            R.drawable.boubou_southern_1l,
            R.raw.nocall
        )
        birdList.add(q40)

        val q41 = Birds(
            41,
            "Boubou Tropical",
            "Tropical Boubou",
            "Laniarius aethiopicus",
            R.drawable.boubou_tropical_1l,
            R.drawable.boubou_tropical_1l,
            R.drawable.boubou_tropical_1l,
            R.drawable.boubou_tropical_1l,
            R.drawable.boubou_tropical_1l,
            R.raw.nocall
        )
        birdList.add(q41)

        val q42 = Birds(
            42,
            "Broadbill African",
            "African Broadbill",
            "Smithornis capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q42)

        val q43 = Birds(
            43,
            "Brownbul Terrestrial",
            "Terrestrial Brownbul",
            "Phyllastrephus terrestris",
            R.drawable.brownbul_terrestrial_1l,
            R.drawable.brownbul_terrestrial_2l,
            R.drawable.brownbul_terrestrial_3j,
            R.drawable.brownbul_terrestrial_4j,
            R.drawable.brownbul_terrestrial_1l,
            R.raw.nocall
        )
        birdList.add(q43)

        val q44 = Birds(
            44,
            "Brubru",
            "Brubru",
            "Nilaus afer",
            R.drawable.brubru_1l,
            R.drawable.brubru_2j,
            R.drawable.brubru_3j,
            R.drawable.brubru_4l,
            R.drawable.brubru_3j,
            R.raw.nocall
        )
        birdList.add(q44)

        val q45 = Birds(
            45,
            "Bulbul Cape",
            "Cape Bulbul",
            "Pycnonotus capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q45)

        val q46 = Birds(
            46,
            "Bulbul Dark-capped",
            "Dark-capped Bulbul",
            "Pycnonotus tricolor",
            R.drawable.bulbul_darkcapped_1j,
            R.drawable.bulbul_darkcapped_2j,
            R.drawable.bulbul_darkcapped_3j,
            R.drawable.bulbul_darkcapped_4j,
            R.drawable.bulbul_darkcapped_5j,
            R.raw.nocall
        )
        birdList.add(q46)

        val q47 = Birds(
            47,
            "Bunting Cape",
            "Cape Bunting",
            "Emberiza capensis",
            R.drawable.bunting_cape_1l,
            R.drawable.bunting_cape_2l,
            R.drawable.bunting_cape_1l,
            R.drawable.bunting_cape_1l,
            R.drawable.bunting_cape_2l,
            R.raw.nocall
        )
        birdList.add(q47)

        val q48 = Birds(
            48,
            "Bunting Cinnamon-breasted",
            "Cinnamon-breasted Bunting",
            "Emberiza tahapisi",
            R.drawable.bunting_cinnamonbreasted_1l,
            R.drawable.bunting_cinnamonbreasted_2l,
            R.drawable.bunting_cinnamonbreasted_1l,
            R.drawable.bunting_cinnamonbreasted_1l,
            R.drawable.bunting_cinnamonbreasted_2l,
            R.raw.nocall
        )
        birdList.add(q48)

        val q49 = Birds(
            49,
            "Bunting Golden-breasted",
            "Golden-breasted Bunting",
            "Emberiza flaviventris",
            R.drawable.bunting_goldenbreasted_1j,
            R.drawable.bunting_goldenbreasted_2j,
            R.drawable.bunting_goldenbreasted_3j,
            R.drawable.bunting_goldenbreasted_4j,
            R.drawable.bunting_goldenbreasted_5l,
            R.raw.nocall
        )
        birdList.add(q49)

        val q50 = Birds(
            50,
            "Bunting Lark-like",
            "Lark-like Bunting",
            "Emberiza impetuani",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q50)

        val q51 = Birds(
            51,
            "Bush Sparrow Yellow-throated",
            "Yellow-throated Bush Sparrow",
            "Gymnoris superciliaris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q51)

        val q52= Birds(
            52,
            "Bushshrike Black-fronted",
            "Black-fronted Bushshrike",
            "Telophorus nigrifrons",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q52)

        val q53 = Birds(
            53,
            "Bushshrike Gorgeous",
            "Gorgeous Bushshrike",
            "Telophorus quadricolor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q53)

        val q54 = Birds(
            54,
            "Bushshrike Grey-headed",
            "Grey-headed Bushshrike",
            "Telophorus bocagei",
            R.drawable.bushshrike_greyheaded_1j,
            R.drawable.bushshrike_greyheaded_2j,
            R.drawable.bushshrike_greyheaded_3j,
            R.drawable.bushshrike_greyheaded_2j,
            R.drawable.bushshrike_greyheaded_1j,
            R.raw.nocall
        )
        birdList.add(q54)

        val q55 = Birds(
            55,
            "Bushshrike Olive",
            "Olive Bushshrike",
            "Telophorus olivaceus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q55)

        val q56 = Birds(
            56,
            "Bushshrike Orange-breasted",
            "Orange-breasted Bushshrike",
            "Telophorus validus",
            R.drawable.bushshrike_orangebreasted_1l,
            R.drawable.bushshrike_orangebreasted_2j,
            R.drawable.bushshrike_orangebreasted_3j,
            R.drawable.bushshrike_orangebreasted_2j,
            R.drawable.bushshrike_orangebreasted_1l,
            R.raw.nocall
        )
        birdList.add(q56)

        val q57 = Birds(
            57,
            "Bustard Black-bellied",
            "Black-bellied Bustard",
            "Lissotis melanogaster",
            R.drawable.bustard_blackbellied_1j,
            R.drawable.bustard_blackbellied_2j,
            R.drawable.bustard_blackbellied_3j,
            R.drawable.bustard_blackbellied_2j,
            R.drawable.bustard_blackbellied_1j,
            R.raw.nocall
        )
        birdList.add(q57)

        val q58 = Birds(
            58,
            "Bustard Denham's",
            "Denham's Bustard",
            "Neotis denhami",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q58)

        val q59= Birds(
            59,
            "Bustard Kori",
            "Kori Bustard",
            "Ardeotis kori",
            R.drawable.bustard_kori_1j,
            R.drawable.bustard_kori_2j,
            R.drawable.bustard_kori_3j,
            R.drawable.bustard_kori_4j,
            R.drawable.bustard_kori_5j,
            R.raw.nocall
        )
        birdList.add(q59)

        val q60 = Birds(
            60,
            "Bustard Ludwig's",
            "Ludwig's Bustard",
            "Neotis ludwigii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q60)

        val q61 = Birds(
            61,
            "Bustard White-bellied",
            "White-bellied Bustard","Eupodotis senegalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q61)

        val q62 = Birds(
            62,
            "Buttonquail Black-rumped",
            "Black-rumped Buttonquail",
            "Turnix nanus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q62)

        val q63 = Birds(
            63,
            "Buttonquail Common",
            "Common Buttonquail",
            "Turnix sylvatica",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q63)

        val q64 = Birds(
            64,
            "Buttonquail Hottentot",
            "Hottentot Buttonquail",
            "Turnix hottentotta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q64)




        val q65 = Birds(
            65,
            "Buzzard Augur",
            "Augur Buzzard",
            "Buteo augur",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q65)

        val q66= Birds(
            66,
            "Buzzard Common",
            "Common Buzzard",
            "Buteo buteo",
            R.drawable.buzzard_common_1l,
            R.drawable.buzzard_common_2l,
            R.drawable.buzzard_common_1l,
            R.drawable.buzzard_common_1l,
            R.drawable.buzzard_common_2l,
            R.raw.nocall
        )
        birdList.add(q66)

        val q67= Birds(
            67,
            "Buzzard Forest",
            "Forest Buzzard",
            "Buteo trizonatu",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q67)

        val q68 = Birds(
            68,
            "Buzzard Jackal",
            "Jackal Buzzard",
            "Buteo rufofuscus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q68)

        val q69 = Birds(
            69,
            "Buzzard Lizard",
            "Lizard Buzzard",
            "Buteo griseocauda",
            R.drawable.buzzard_lizard_1l,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q69)

        val q70 = Birds(
            70,
            "Buzzard Long-legged",
            "Long-legged Buzzard",
            "Buteo rufinus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q70)

        val q71 = Birds(
            71,
            "Camaroptera Green-backed",
            "Green-backed Camaroptera",
            "Camaroptera brachyura",
            R.drawable.camaroptera_greenbacked_1j,
            R.drawable.camaroptera_greenbacked_1j,
            R.drawable.camaroptera_greenbacked_1j,
            R.drawable.camaroptera_greenbacked_1j,
            R.drawable.camaroptera_greenbacked_1j,
            R.raw.nocall
        )
        birdList.add(q71)

        val q72 = Birds(
            72,
            "Camaroptera Grey-backed",
            "=Grey-backed Camaroptera",
            "Camaroptera brevicaudata",
            R.drawable.camaroptera_greybacked_1l,
            R.drawable.camaroptera_greybacked_1l,
            R.drawable.camaroptera_greybacked_1l,
            R.drawable.camaroptera_greybacked_1l,
            R.drawable.camaroptera_greybacked_1l,
            R.raw.nocall
        )
        birdList.add(q72)

        val q73 = Birds(
            73,
            "Canary Black-headed",
            "Black-headed Canary",
            "Serinus alario",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q73)

        val q74= Birds(
            74,
            "Canary Black-throated",
            "Black-throated Canary",
            "Serinus atrogularis",
            R.drawable.canary_blackthoated_1l,
            R.drawable.canary_blackthoated_1l,
            R.drawable.canary_blackthoated_1l,
            R.drawable.canary_blackthoated_1l,
            R.drawable.canary_blackthoated_1l,
            R.raw.nocall
        )
        birdList.add(q74)

        val q75 = Birds(
            75,
            "Canary Brimstone",
            "Brimstone Canary",
            "Serinus sulphuratus",
            R.drawable.canary_brimstone_1l,
            R.drawable.canary_brimstone_2l,
            R.drawable.canary_brimstone_3l,
            R.drawable.canary_brimstone_4l,
            R.drawable.canary_brimstone_1l,
            R.raw.nocall
        )
        birdList.add(q75)

        val q76 = Birds(
            76,
            "Canary Cape",
            "Cape Canary",
            "Serinus canicollis",
            R.drawable.canary_cape_1l,
            R.drawable.canary_cape_2l,
            R.drawable.canary_cape_3l,
            R.drawable.canary_cape_2l,
            R.drawable.canary_cape_1l,
            R.raw.nocall
        )
        birdList.add(q76)

        val q77 = Birds(
            77,
            "Canary Forest",
            "Forest Canary",
            "Crithagra scotops",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q77)

        val q78= Birds(
            78,
            "Canary Protea",
            "Protea Canary",
            "Crithagra leucoptera",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q78)

        val q79= Birds(
            79,
            "Canary White-throated",
            "White-throated Canary",
            "Serinus albogularis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q79)

        val q80 = Birds(
            80,
            "Canary Yellow",
            "Yellow Canary",
            "Serinus flavigula",
            R.drawable.canary_yellow_1l,
            R.drawable.canary_yellow_1l,
            R.drawable.canary_yellow_1l,
            R.drawable.canary_yellow_1l,
            R.drawable.canary_yellow_1l,
            R.raw.nocall
        )
        birdList.add(q80)

        val q81 = Birds(
            81,
            "Canary Yellow-fronted",
            "Yellow-fronted Canary",
            "Serinus mozambicus",
            R.drawable.canary_yellowfronted_1j,
            R.drawable.canary_yellowfronted_2j,
            R.drawable.canary_yellowfronted_1j,
            R.drawable.canary_yellowfronted_1j,
            R.drawable.canary_yellowfronted_2j,
            R.raw.nocall
        )
        birdList.add(q81)

        val q82 = Birds(
            82,
            "Chat Ant-eating",
            "Ant-eating Chat",
            "Myrmecocichla formicivora",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q82)

        val q83 = Birds(
            83,
            "Chat Arnot's",
            "Arnot's Chat",
            "Myrmecocichla arnotti",
            R.drawable.chat_arnots_1l,
            R.drawable.chat_arnots_1l,
            R.drawable.chat_arnots_1l,
            R.drawable.chat_arnots_1l,
            R.drawable.chat_arnots_1l,
            R.raw.nocall
        )
        birdList.add(q83)

        val q84 = Birds(
            84,
            "Chat Buff-streaked",
            "Buff-streaked Chat",
            "Calamonastes stierlingi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q84)

        val q85 = Birds(
            85,
            "Chat Familiar",
            "Familiar Chat",
            " Cercomela familiaris",
            R.drawable.chat_familiar_1l,
            R.drawable.chat_familiar_2l,
            R.drawable.chat_familiar_3j,
            R.drawable.chat_familiar_2l,
            R.drawable.chat_familiar_1l,
            R.raw.nocall
        )
        birdList.add(q85)

        val q86= Birds(
            86,
            "Chat Herero",
            "Herero Chat",
            "Namibornis herero",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q86)

        val q87 = Birds(
            87,
            "Chat Karoo",
            "Karoo Chat",
            "Cercomela schlegelii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q87)

        val q88 = Birds(
            88,
            "Chat Mocking Cliff",
            "Mocking Cliff Chat",
            "Thamnolaea cinnamomeiventris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q88)

        val q89 = Birds(
            89,
            "Chat Sickle-winged",
            "Sickle-winged Chat",
            "Cossypha anomala",
            R.drawable.chat_sicklewinged_1l,
            R.drawable.chat_sicklewinged_2l,
            R.drawable.chat_sicklewinged_2l,
            R.drawable.chat_sicklewinged_2l,
            R.drawable.chat_sicklewinged_1l,
            R.raw.nocall
        )
        birdList.add(q89)

        val q90 = Birds(
            90,
            "Chat Tractrac",
            "Tractrac Chat",
            "Cercomela tractrac",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q90)

        val q91= Birds(
            91,
            "Cisticola Cloud",
            "Cloud Cisticola",
            "Cisticola textrix",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q91)

        val q92= Birds(
            92,
            "Cisticola Croaking",
            "Croaking Cisticola",
            "Cisticola natalensis",
            R.drawable.cisticola_croaking_1l,
            R.drawable.cisticola_croaking_1l,
            R.drawable.cisticola_croaking_1l,
            R.drawable.cisticola_croaking_1l,
            R.drawable.cisticola_croaking_1l,
            R.raw.nocall
        )
        birdList.add(q92)

        val q93= Birds(
            93,
            "Cisticola Desert",
            "Desert Cisticola",
            "Cisticola aridulus",
            R.drawable.cisticola_desert_1l,
            R.drawable.cisticola_desert_2l,
            R.drawable.cisticola_desert_3l,
            R.drawable.cisticola_desert_2l,
            R.drawable.cisticola_desert_1l,
            R.raw.nocall
        )
        birdList.add(q93)

        val q94 = Birds(
            94,
            "Cisticola Grey-backed",
            "Grey-backed Cisticola",
            "Cisticola subruficapilla",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q94)

        val q95 = Birds(
            95,
            "Cisticola Lazy",
            "Lazy Cisticola",
            "Cisticola aberrans",
            R.drawable.cisticola_lazy_1l,
            R.drawable.cisticola_lazy_2l,
            R.drawable.cisticola_lazy_1l,
            R.drawable.cisticola_lazy_2l,
            R.drawable.cisticola_lazy_1l,
            R.raw.nocall
        )
        birdList.add(q95)

        val q96 = Birds(
            96,
            "Cisticola Levaillant's",
            "Levaillant's Cisticola",
            "Cisticola tinniens",
            R.drawable.cisticola_levaillant_1l,
            R.drawable.cisticola_levaillant_1l,
            R.drawable.cisticola_levaillant_1l,
            R.drawable.cisticola_levaillant_1l,
            R.drawable.cisticola_levaillant_1l,
            R.raw.nocall
        )
        birdList.add(q96)

        val q97 = Birds(
            97,
            "Cisticola Pale-crowned",
            "Pale-crowned Cisticola",
            "Cisticola cinnamomeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q97)

        val q98 = Birds(
            98,
            "Cisticola Rattling",
            "Rattling Cisticola",
            "Cisticola chiniana",
            R.drawable.cisticola_rattling_1j,
            R.drawable.cisticola_rattling_2j,
            R.drawable.cisticola_rattling_3j,
            R.drawable.cisticola_rattling_4j,
            R.drawable.cisticola_rattling_5j,
            R.raw.nocall
        )
        birdList.add(q98)

        val q99 = Birds(
            99,
            "Cisticola Red-faced",
            "Red-faced Cisticola",
            "Cisticola erythrops",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q99)

        val q100 = Birds(
            100,
            "Cisticola Rufous-winged",
            "Rufous-winged Cisticola",
            "Cisticola rufilatus",
            R.drawable.cisticola_rufouswinged_1l,
            R.drawable.cisticola_rufouswinged_1l,
            R.drawable.cisticola_rufouswinged_1l,
            R.drawable.cisticola_rufouswinged_1l,
            R.drawable.cisticola_rufouswinged_1l,
            R.raw.nocall
        )
        birdList.add(q100)

        val q101 = Birds(
            101,
            "Cisticola Tinkling",
            "Tinkling Cisticola",
            "Cisticola rufilautus",
            R.drawable.cisticola_tinkling_1l,
            R.drawable.cisticola_tinkling_1l,
            R.drawable.cisticola_tinkling_1l,
            R.drawable.cisticola_tinkling_1l,
            R.drawable.cisticola_tinkling_1l,
            R.raw.nocall
        )
        birdList.add(q101)

        val q102 = Birds(
            102,
            "Cisticola Wailing",
            "Wailing Cisticola",
            "Cisticola lais",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.quail_common_1
        )
        birdList.add(q102)

        val q103 = Birds(
            103,
            "Cisticola Wing-snapping",
            "Wing-snapping Cisticola",
            "Cisticola ayresii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q103)

        val q104 = Birds(
            104,
            "Cisticola Zitting",
            "Zitting Cisticola",
            "Cisticola juncidis",
            R.drawable.cisticola_zitting_1l,
            R.drawable.cisticola_zitting_2l,
            R.drawable.cisticola_zitting_3l,
            R.drawable.cisticola_zitting_2l,
            R.drawable.cisticola_zitting_1l,
            R.raw.nocall
        )
        birdList.add(q104)

        val q105 = Birds(
            105,
            "Coot Red-knobbed",
            "Red-knobbed Coot",
            "Fulica crassirostris",
            R.drawable.coot_redknobbed_1l,
            R.drawable.coot_redknobbed_2l,
            R.drawable.coot_redknobbed_1l,
            R.drawable.coot_redknobbed_2l,
            R.drawable.coot_redknobbed_1l,
            R.raw.nocall
        )
        birdList.add(q105)

        val q106 = Birds(
            106,
            "Cormorant Bank",
            "Bank Cormorant",
            "Phalacrocorax neglectus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q106)

        val q107= Birds(
            107,
            "Cormorant Cape",
            "Cape Cormorant",
            "Phalacrocorax capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q107)

        val q108 = Birds(
            108,
            "Cormorant Crowned",
            "Crowned Cormorant",
            "Phalacrocorax coronatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q108)

        val q109 = Birds(
            109,
            "Cormorant Reed",
            "Reed Cormorant",
            "Microcarbo africanus",
            R.drawable.cormorant_reed_1j,
            R.drawable.cormorant_reed_2l,
            R.drawable.cormorant_reed_3j,
            R.drawable.cormorant_reed_2l,
            R.drawable.cormorant_reed_3j,
            R.raw.nocall
        )
        birdList.add(q109)

        val q110= Birds(
            110,
            "Cormorant White-breasted",
            "White-breasted Cormorant",
            "Phalacrocorax carbo",
            R.drawable.cormorant_whitebreasted_1l,
            R.drawable.cormorant_whitebreasted_2l,
            R.drawable.cormorant_whitebreasted_1l,
            R.drawable.cormorant_whitebreasted_2l,
            R.drawable.cormorant_whitebreasted_1l,
            R.raw.nocall
        )
        birdList.add(q110)

        val q111 = Birds(
            111,
            "Coucal Black",
            "Black Coucal",
            "Centropus grillii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q111)

        val q112= Birds(
            112,
            "Coucal Burchell's",
            "Coucal Burchell's Coucal",
            "Centropus burchellii",
            R.drawable.coucal_burchell_1l,
            R.drawable.coucal_burchell_2j,
            R.drawable.coucal_burchell_3j,
            R.drawable.coucal_burchell_4j,
            R.drawable.coucal_burchell_5j,
            R.raw.sandgrouse_namaqua_1
        )
        birdList.add(q112)

        val q113 = Birds(
            113,
            "Courser Bronze-winged",
            "Bronze-winged Courser",
            "Rhinoptilus chalcopterus",
            R.drawable.courser_bronzewinged_1l,
            R.drawable.courser_bronzewinged_2l,
            R.drawable.courser_bronzewinged_1l,
            R.drawable.courser_bronzewinged_2l,
            R.drawable.courser_bronzewinged_1l,
            R.raw.nocall
        )
        birdList.add(q113)

        val q114 = Birds(
            114,
            "Courser Burchell's",
            "Burchell's Courser",
            "Smutsornis africanus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q114)

        val q115 = Birds(
            115,
            "Courser Double-banded",
            "Double-banded Courser",
            "Rhinoptilus africanus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q115)

        val q116 = Birds(
            116,
            "Courser Temminck's",
            "Temminck's Courser",
            "Cursorius temminckii",
            R.drawable.courser_temminick_1l,
            R.drawable.courser_temminick_2l,
            R.drawable.courser_temminick_3l,
            R.drawable.courser_temminick_4j,
            R.drawable.courser_temminick_1l,
            R.raw.nocall
        )
        birdList.add(q116)

        val q117= Birds(
            117,
            "Crake African",
            "African Crake",
            "Crex egregia",
            R.drawable.crake_african_1l,
            R.drawable.crake_african_1l,
            R.drawable.crake_african_1l,
            R.drawable.crake_african_1l,
            R.drawable.crake_african_1l,
            R.raw.nocall
        )
        birdList.add(q117)

        val q118 = Birds(
            118,
            "Crake Bailon's",
            "Bailon's Crake",
            "Porzana bailonii",
            R.drawable.crake_baillon_1l,
            R.drawable.crake_baillon_1l,
            R.drawable.crake_baillon_1l,
            R.drawable.crake_baillon_1l,
            R.drawable.crake_baillon_1l,
            R.raw.nocall
        )
        birdList.add(q118)

        val q119 = Birds(
            119,
            "Crake Black",
            "Black Crake",
            "Porzana flaviventer",
            R.drawable.crake_black_1j,
            R.drawable.crake_black_2j,
            R.drawable.crake_black_3j,
            R.drawable.crake_black_4j,
            R.drawable.crake_black_5j,
            R.raw.nocall
        )
        birdList.add(q119)

        val q120 = Birds(
            120,
            "Crake Corn",
            "Corn Crake",
            "Crex crex",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q120)

        val q121 = Birds(
            121,
            "Crake Striped",
            "Striped Crake",
            "Porzana porzana",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q121)

        val q122 = Birds(
            122,
            "Crane Blue",
            "Blue Crane",
            "Anthropoides paradisea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q122)

        val q123 = Birds(
            123,
            "Crane Grey Crowned",
            "Grey Crowned Crane",
            "Balearica regulorum",
            R.drawable.crane_greycrowned_1j,
            R.drawable.crane_greycrowned_1j,
            R.drawable.crane_greycrowned_1j,
            R.drawable.crane_greycrowned_1j,
            R.drawable.crane_greycrowned_1j,
            R.raw.nocall
        )
        birdList.add(q123)

        val q124 = Birds(
            124,
            "Crane Wattled",
            "Wattled Crane",
            "Grus carunculatus",
            R.drawable.crane_wattled_1j,
            R.drawable.crane_wattled_1j,
            R.drawable.crane_wattled_1j,
            R.drawable.crane_wattled_1j,
            R.drawable.crane_wattled_1j,
            R.raw.nocall
        )
        birdList.add(q124)

        val q125= Birds(
            125,
            "Crombec Long-billed",
            "Long-billed Crombec",
            "Sylvietta rufescens",
            R.drawable.crombec_longbilled_1j,
            R.drawable.crombec_longbilled_2j,
            R.drawable.crombec_longbilled_3j,
            R.drawable.crombec_longbilled_4j,
            R.drawable.crombec_longbilled_5j,
            R.raw.nocall
        )
        birdList.add(q125)

        val q126 = Birds(
            126,
            "Crow Cape",
            "Cape Crow",
            "Corvus albus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q126)

        val q127 = Birds(
            127,
            "Crow Pied",
            "Pied Crow",
            "Corvus albus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q127)

        val q128 = Birds(
            128,
            "Cuckoo African",
            "African Cuckoo",
            "Cuculus gularis",
            R.drawable.cuckoo_african_1l,
            R.drawable.cuckoo_african_1l,
            R.drawable.cuckoo_african_1l,
            R.drawable.cuckoo_african_1l,
            R.drawable.cuckoo_african_1l,
            R.raw.spurfowl_swainson_1
        )
        birdList.add(q128)

        val q129= Birds(
            129,
            "Cuckoo African Emerald",
            "African Emerald Cuckoo",
            "Chrysococcyx cupreus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q129)

        val q130 = Birds(
            130,
            "Cuckoo Black",
            "Black Cuckoo",
            "Cuculus clamosus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q130)

        val q131 = Birds(
            131,
            "Cuckoo Common",
            "Common Cuckoo",
            "Cuculus canorus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q131)

        val q132 = Birds(
            132,
            "Cuckoo Diederik",
            "Diederik Cuckoo",
            "Chrysococcyx caprius",
            R.drawable.cuckoo_diederik_1j,
            R.drawable.cuckoo_diederik_2j,
            R.drawable.cuckoo_diederik_2j,
            R.drawable.cuckoo_diederik_2j,
            R.drawable.cuckoo_diederik_1j,
            R.raw.nocall
        )
        birdList.add(q132)

        val q133= Birds(
            133,
            "Cuckoo Great Spotted",
            "Great Spotted Cuckoo",
            "Clamator glandarius",
            R.drawable.cuckoo_greatspotted_1l,
            R.drawable.cuckoo_greatspotted_1l,
            R.drawable.cuckoo_greatspotted_1l,
            R.drawable.cuckoo_greatspotted_1l,
            R.drawable.cuckoo_greatspotted_1l,
            R.raw.stonechat_african_1
        )
        birdList.add(q133)

        val q134 = Birds(
            134,
            "Cuckoo Jacobin",
            "Jacobin Cuckoo",
            "Clamator jacobinus",
            R.drawable.cuckoo_jacobin_1l,
            R.drawable.cuckoo_jacobin_2j,
            R.drawable.cuckoo_jacobin_3j,
            R.drawable.cuckoo_jacobin_4j,
            R.drawable.cuckoo_jacobin_4j,
            R.raw.nocall
        )
        birdList.add(q134)

        val q135 = Birds(
            135,
            "Cuckoo Klaas's",
            "Klaas's Cuckoo",
            "Chrysococcyx klaas",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q135)

        val q136 = Birds(
            136,
            "Cuckoo Levaillant's",
            "Levaillant's Cuckoo",
            "Chrysococcyx caprius",
            R.drawable.cuckoo_levaillant_1l,
            R.drawable.cuckoo_levaillant_2j,
            R.drawable.cuckoo_levaillant_2j,
            R.drawable.cuckoo_levaillant_2j,
            R.drawable.cuckoo_levaillant_1l,
            R.raw.sunbird_marico_1
        )
        birdList.add(q136)

        val q137 = Birds(
            137,
            "Cuckoo Red-chested",
            "Red-chested Cuckoo",
            "Cuculus solitarius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q137)

        val q138= Birds(
            138,
            "Cuckoo Thick-billed",
            "Thick-billed Cuckoo",
            "Pachycoccyx audeberti",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q138)

        val q139 = Birds(
            139,
            "Cuckooshrike Black",
            "Black Cuckooshrike",
            "Campephaga flava",
            R.drawable.cuckooshrike_black_1l,
            R.drawable.cuckooshrike_black_2j,
            R.drawable.cuckooshrike_black_3j,
            R.drawable.cuckooshrike_black_4j,
            R.drawable.cuckooshrike_black_2j,
            R.raw.swallow_lesserstriped_1
        )
        birdList.add(q139)

        val q140= Birds(
            140,
            "Cuckooshrike Grey",
            "Grey Cuckooshrike",
            "Campephaga phoenicea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q140)

        val q141 = Birds(
            141,
            "Cuckooshrike White-breasted",
            "White-breasted Cuckooshrike",
            "Campephaga lobata",
            R.drawable.cuckooshrike_whitebreasted_1l,
            R.drawable.cuckooshrike_whitebreasted_1l,
            R.drawable.cuckooshrike_whitebreasted_1l,
            R.drawable.cuckooshrike_whitebreasted_1l,
            R.drawable.cuckooshrike_whitebreasted_1l,
            R.raw.nocall
        )
        birdList.add(q141)

        val q142 = Birds(
            142,
            "Curlew Eurasian",
            "Eurasian Curlew",
            "Numenius arquata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q142)

        val q143 = Birds(
            143,
            "Darter African",
            "African Darter",
            "Anhinga rufa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q143)

        val q144 = Birds(
            144,
            "Dove African Mourning",
            "African Mourning Dove",
            "Streptopelia decipiens",
            R.drawable.dove_mourning_1j,
            R.drawable.dove_mourning_2j,
            R.drawable.dove_mourning_3j,
            R.drawable.dove_mourning_4j,
            R.drawable.dove_mourning_5j,
            R.raw.tchagra_blackcrowned_1
        )
        birdList.add(q144)

        val q145= Birds(
            145,
            "Dove Emerald-spotted Wood",
            "Emerald-spotted Wood Dove",
            "Turtur chalcospilos",
            R.drawable.dove_emeraldspotted_1j,
            R.drawable.dove_emeraldspotted_2j,
            R.drawable.dove_emeraldspotted_3j,
            R.drawable.dove_emeraldspotted_4j,
            R.drawable.dove_emeraldspotted_5j,
            R.raw.tchagra_browncrowned_1
        )
        birdList.add(q145)

        val q146= Birds(
            146,
            "Dove European Turtle",
            "European Turtle Dove",
            "Streptopelia turtur",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q146)

        val q147 = Birds(
            147,
            "Dove Laughing",
            "Laughing Dove",
            "Streptopelia senegalensis",
            R.drawable.dove_laughing_1j,
            R.drawable.dove_laughing_2j,
            R.drawable.dove_laughing_3j,
            R.drawable.dove_laughing_2j,
            R.drawable.dove_laughing_1j,
            R.raw.thickknee_water_1
        )
        birdList.add(q147)

        val q148 = Birds(
            148,
            "Dove Lemon",
            "Lemon Dove",
            "Streptopelia senegalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q148)

        val q149 = Birds(149,
            "Dove Namaqua",
            "Namaqua Dove",
            "Oena capensis",
            R.drawable.dove_namaqau_1j,
            R.drawable.dove_namaqau_2j,
            R.drawable.dove_namaqau_3j,
            R.drawable.dove_namaqau_4j,
            R.drawable.dove_namaqau_5j,
            R.raw.tit_ashy_1
        )
        birdList.add(q149)

        val q150 = Birds(150,
            "Dove Red-eyed",
            "Red-eyed Dove",
            "Streptopelia semitorquata",
            R.drawable.dove_redeyed_1l,
            R.drawable.dove_redeyed_1l,
            R.drawable.dove_redeyed_1l,
            R.drawable.dove_redeyed_1l,
            R.drawable.dove_redeyed_1l,
            R.raw.pendulinetit_cape_1
        )
        birdList.add(q150)

        val q151 = Birds(151,
            "Dove Ring-necked",
            "Ring-necked Dove",
            "Streptopelia capicola",
            R.drawable.dove_ringnecked_1l,
            R.drawable.dove_ringnecked_2l,
            R.drawable.dove_ringnecked_3j,
            R.drawable.dove_ringnecked_2l,
            R.drawable.dove_ringnecked_1l,
            R.raw.nocall
        )
        birdList.add(q151)

        val q152 = Birds(152,
            "Dove Tambourine",
            "Tambourine Dove",
            "Turtur tympanistria",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q152)

        val q153 = Birds(153,
            "Drongo Common Square-tailed",
            "Common Square-tailed Drongo",
            "Dicrurus ludwigii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q153)

        val q154 = Birds(154,
            "Drongo Fork-tailed",
            "Fork-tailed Drongo",
            "Dicrurus adsimilis",
            R.drawable.drongo_forktailed_1j,
            R.drawable.drongo_forktailed_2j,
            R.drawable.drongo_forktailed_1j,
            R.drawable.drongo_forktailed_2j,
            R.drawable.drongo_forktailed_1j,
            R.raw.nocall
        )
        birdList.add(q154)



        val q155 = Birds(155,
            "Duck African Black",
            "African Black Duck","Anas sparsa",
            R.drawable.duck_africanblack_1l,
            R.drawable.duck_africanblack_2l,
            R.drawable.duck_africanblack_1l,
            R.drawable.duck_africanblack_2l,
            R.drawable.duck_africanblack_1l,
            R.raw.nocall
        )
        birdList.add(q155)

        val q156= Birds(156,
            "Duck Fulvous",
            "Fulvous Duck","Anas fulvigula",
            R.drawable.duck_fulvous_1l,
            R.drawable.duck_fulvous_2l,
            R.drawable.duck_fulvous_1l,
            R.drawable.duck_fulvous_2l,
            R.drawable.duck_fulvous_1l,
            R.raw.warbler_greatreed_1
        )
        birdList.add(q156)


        val q157 = Birds(157,
            "Duck Knob-billed",
            "Knob-billed Duck","Sarkidiornis melanotos",
            R.drawable.duck_knobbilled_1l,
            R.drawable.duck_knobbilled_2l,
            R.drawable.duck_knobbilled_3j,
            R.drawable.duck_knobbilled_2l,
            R.drawable.duck_knobbilled_1l,
            R.raw.warbler_lesserswamp_1
        )
        birdList.add(q157)

        val q158 = Birds(158,
            "Duck Maccoa",
            "Maccoa Duck","Oxyura maccoa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q158)

        val q159 = Birds(159,
            "Duck White-Backed",
            "White-Backed Duck","Thalassornis leuconotus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q159)

        val q160 = Birds(160,
            "Duck White-Faced Whistling",
            "White-Faced Whistling Duck","Dendrocygna viduata",
            R.drawable.duck_whitefacedwhistling_1l,
            R.drawable.duck_whitefacedwhistling_2j,
            R.drawable.duck_whitefacedwhistling_3j,
            R.drawable.duck_whitefacedwhistling_2j,
            R.drawable.duck_whitefacedwhistling_1l,
            R.raw.waxbill_blackfaced_1
        )
        birdList.add(q160)

        val q161 = Birds(161,
            "Duck Yellow-billed",
            "Yellow-billed Duck","Anas undulata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q161)

        val q162= Birds(162,
            "Eagle African Crowned",
            "African Crowned Eagle","Stephanoaetus coronatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q162)

        val q163 = Birds(163,
            "Eagle African Fish",
            "African Fish Eagle","Haliaeetus vocifer",
            R.drawable.eagle_fish_1j,
            R.drawable.eagle_fish_2j,
            R.drawable.eagle_fish_3j,
            R.drawable.eagle_fish_4j,
            R.drawable.eagle_fish_5j,
            R.raw.nocall
        )
        birdList.add(q163)

        val q164 = Birds(164,
            "Eagle African Hawk",
            "African Hawk Eagle","Hieraaetus fasciatus",
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.raw.nocall
        )
        birdList.add(q164)

        val q165= Birds(165,
            "Eagle Ayres's Hawk",
            "Ayres's Hawk Eagle","Hieraaetus ayresii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q165)

        val q166 = Birds(166,
            "Eagle Black-chested Snake",
            "Black-chested Snake Eagle"," Circaetus pectoralis",
            R.drawable.eagle_blackchested_1j,
            R.drawable.eagle_blackchested_1j,
            R.drawable.eagle_blackchested_1j,
            R.drawable.eagle_blackchested_1j,
            R.drawable.eagle_blackchested_1j,
            R.raw.wheatear_capped_1
        )
        birdList.add(q166)


        val q167 = Birds(167,
            "Eagle Booted",
            "Booted Eagle","Hieraaetus pennatus",
            R.drawable.eagle_booted_1l,
            R.drawable.eagle_booted_1l,
            R.drawable.eagle_booted_1l,
            R.drawable.eagle_booted_1l,
            R.drawable.eagle_booted_1l,
            R.raw.nocall
        )
        birdList.add(q167)

        val q168 = Birds(168,
            "Eagle Brown Snake",
            "Brown Snake Eagle","Circaetus cinereus",
            R.drawable.eagle_brownsnake_3j,
            R.drawable.eagle_brownsnake_2j,
            R.drawable.eagle_brownsnake_1j,
            R.drawable.eagle_brownsnake_2j,
            R.drawable.eagle_brownsnake_3j,
            R.raw.nocall
        )
        birdList.add(q168)

        val q169 = Birds(169,
            "Eagle Lesser Spotted",
            "Lesser Spotted Eagle","Clanga pomarina",
            R.drawable.eagle_lesserspotted_1l,
            R.drawable.eagle_lesserspotted_1l,
            R.drawable.eagle_lesserspotted_1l,
            R.drawable.eagle_lesserspotted_1l,
            R.drawable.eagle_lesserspotted_1l,
            R.raw.weaver_village_1
        )
        birdList.add(q169)

        val q170 = Birds(170,
            "Eagle Long-crested",
            "Long-crested Eagle","Lophaetus occipitalis",
            R.drawable.eagle_longcrested_1l,
            R.drawable.eagle_longcrested_2l,
            R.drawable.eagle_longcrested_1l,
            R.drawable.eagle_longcrested_2l,
            R.drawable.eagle_longcrested_1l,
            R.raw.weaver_village_1
        )
        birdList.add(q170)

        val q171= Birds(171,
            "Eagle Martial",
            "Martial Eagle","Polemaetus bellicosus",
            R.drawable.eagle_martial_1j,
            R.drawable.eagle_martial_2j,
            R.drawable.eagle_martial_3j,
            R.drawable.eagle_martial_2j,
            R.drawable.eagle_martial_1j,
            R.raw.weaver_whitebrowedsparrow_1
        )
        birdList.add(q171)

        val q172 = Birds(172,
            "Eagle Southern Banded Snake",
            "Southern Banded Snake Eagle","Dryotriorchis spectabilis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.whydah_paradise_1
        )
        birdList.add(q172)

        val q173 = Birds(173,
            "Eagle Steppe",
            "Steppe Eagle","Aquila nipalensis",
            R.drawable.eagle_steppe_1j,
            R.drawable.eagle_steppe_1j,
            R.drawable.eagle_steppe_1j,
            R.drawable.eagle_steppe_1j,
            R.drawable.eagle_steppe_1j,
            R.raw.whydah_pintailed_1
        )
        birdList.add(q173)

        val q174 = Birds(174,
            "Eagle Tawny",
            "Tawny Eagle","Aquila rapax",
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.raw.nocall
        )
        birdList.add(q174)

        val q175 = Birds(175,
            "Eagle Verreaux's",
            "Verreaux's Eagle","Aquila verreauxii",
            R.drawable.eagle_verreaux_1l,
            R.drawable.eagle_verreaux_2l,
            R.drawable.eagle_verreaux_1l,
            R.drawable.eagle_verreaux_2l,
            R.drawable.eagle_verreaux_1l,
            R.raw.woodhoopoe_green_1
        )
        birdList.add(q175)

        val q176= Birds(176,
            "Eagle Wahlberg's",
            "Wahlberg's Eagle","Hieraaetus wahlbergi",
            R.drawable.eagle_wahlberg_1l,
            R.drawable.eagle_wahlberg_2j,
            R.drawable.eagle_wahlberg_3j,
            R.drawable.eagle_wahlberg_4j,
            R.drawable.eagle_wahlberg_5j,
            R.raw.woodpecker_bearded_1
        )
        birdList.add(q176)

        val q177 = Birds(177,
            "Egret Great",
            "Great Egret","Ardea alba",
            R.drawable.egret_great_1j,
            R.drawable.egret_great_2j,
            R.drawable.egret_great_3j,
            R.drawable.egret_great_4j,
            R.drawable.egret_great_5j,
            R.raw.nocall
        )
        birdList.add(q177)

        val q178 = Birds(178,
            "Egret Little",
            "Little Egret","Egretta garzetta",
            R.drawable.egret_little_1j,
            R.drawable.egret_little_2j,
            R.drawable.egret_little_1j,
            R.drawable.egret_little_2j,
            R.drawable.egret_little_1j,
            R.raw.woodpecker_cardinal_1
        )
        birdList.add(q178)

        val q179 = Birds(179,
            "Egret Western Cattle",
            "Western Cattle Egret","Bubulcus ibis",
            R.drawable.egret_westerncattle_1j,
            R.drawable.egret_westerncattle_2j,
            R.drawable.egret_westerncattle_3j,
            R.drawable.egret_westerncattle_4j,
            R.drawable.egret_westerncattle_5j,
            R.raw.nocall
        )
        birdList.add(q179)

        val q180 = Birds(180,
            "Egret Yellow-billed",
            "Yellow-billed Egret","Ardea ibis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q180)

        val q181 = Birds(181,
            "Eremomela Burnt-necked",
            "Burnt-necked Eremomela","Eremomela usticollis",
            R.drawable.eremomela_burntnecked_1l,
            R.drawable.eremomela_burntnecked_2l,
            R.drawable.eremomela_burntnecked_1l,
            R.drawable.eremomela_burntnecked_2l,
            R.drawable.eremomela_burntnecked_1l,
            R.raw.nocall
        )
        birdList.add(q181)

        val q182= Birds(182,
            "Eremomela Green-capped",
            "Green-capped Eremomela","Eremomela scotops",
            R.drawable.eremomela_greencapped_1l,
            R.drawable.eremomela_greencapped_1l,
            R.drawable.eremomela_greencapped_1l,
            R.drawable.eremomela_greencapped_1l,
            R.drawable.eremomela_greencapped_1l,
            R.raw.nocall
        )
        birdList.add(q182)

        val q183 = Birds(183,
            "Eremomela Karoo",
            "Karoo Eremomela","Eremomela gregalis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q183)

        val q184 = Birds(184,
            "Eremomela Yellow-bellied",
            "Yellow-bellied Eremomela","Eremomela icteropygialis",
            R.drawable.eremomela_yellowbellied_1l,
            R.drawable.eremomela_yellowbellied_1l,
            R.drawable.eremomela_yellowbellied_1l,
            R.drawable.eremomela_yellowbellied_1l,
            R.drawable.eremomela_yellowbellied_1l,
            R.raw.nocall
        )
        birdList.add(q184)

        val q185 = Birds(185,
            "Falcon Amur",
            "Amur Falcon","Falco amurensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q185)

        val q186 = Birds(186,
            "Falcon Lanner",
            "Lanner Falcon","Falco biarmicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q186)

        val q187 = Birds(187,
            "Falcon Peregrine",
            "Peregrine Falcon","Falco peregrinus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q187)

        val q188= Birds(188,
            "Falcon Pygmy",
            "Pygmy Falcon","Polihierax semitorquatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q188)

        val q189 = Birds(189,
            "Falcon Red-footed",
            "Red-footed Falcon","Falco vespertinu",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q189)

        val q190 = Birds(190,
            "Falcon Red-necked",
            "Red-necked Falcon","Falco chicquera",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q190)

        val q191 = Birds(191,
            "Falcon Sooty",
            "Sooty Falcon","Falco concolor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q191)

        val q192 = Birds(192,
            "Falcon Taita",
            "Taita Falcon","Falco fasciinucha",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q192)

        val q193 = Birds(193,
            "Finch African Quail",
            "African Quail Finch","Ortygospiza atricollis",
            R.drawable.finch_africanquail_1l,
            R.drawable.finch_africanquail_1l,
            R.drawable.finch_africanquail_1l,
            R.drawable.finch_africanquail_1l,
            R.drawable.finch_africanquail_1l,
            R.raw.nocall
        )
        birdList.add(q193)

        val q194 = Birds(194,
            "Finch Cuckoo",
            "Cuckoo Finch","Anomalospiza imberbis",
            R.drawable.finch_cuckoo_1l,
            R.drawable.finch_cuckoo_1l,
            R.drawable.finch_cuckoo_1l,
            R.drawable.finch_cuckoo_1l,
            R.drawable.finch_cuckoo_1l,
            R.raw.nocall
        )
        birdList.add(q194)

        val q195 = Birds(195,
            "Finch Cut-throat",
            "Cut-throat Finch","Amadina fasciata",
            R.drawable.finch_cutthroat_1j,
            R.drawable.finch_cutthroat_1j,
            R.drawable.finch_cutthroat_1j,
            R.drawable.finch_cutthroat_1j,
            R.drawable.finch_cutthroat_1j,
            R.raw.nocall
        )
        birdList.add(q195)

        val q196 = Birds(196,
            "Finch Red-headed",
            "Red-headed Finch","Amadina erythrocephala",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q196)

        val q197= Birds(197,
            "Finch Scaly-feathered",
            "Scaly-feathered Finch","Sporopipes squamifrons",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q197)

        val q198 = Birds(198,
            "Finfoot African",
            "African Finfoot","Podica senegalensis",
            R.drawable.finfoot_african_1l,
            R.drawable.finfoot_african_1l,
            R.drawable.finfoot_african_1l,
            R.drawable.finfoot_african_1l,
            R.drawable.finfoot_african_1l,
            R.raw.nocall
        )
        birdList.add(q198)

        val q199 = Birds(199,
            "Firefinch African",
            "African Firefinch","Lagonosticta rubricata",
            R.drawable.firefinch_african_1l,
            R.drawable.firefinch_african_2l,
            R.drawable.firefinch_african_1l,
            R.drawable.firefinch_african_2l,
            R.drawable.firefinch_african_1l,
            R.raw.nocall
        )
        birdList.add(q199)

        val q200= Birds(200,
            "Firefinch Jameson's",
            "Jameson's Firefinch","Lagonosticta rufopicta",
            R.drawable.firefinch_jameson_1j,
            R.drawable.firefinch_jameson_1j,
            R.drawable.firefinch_jameson_1j,
            R.drawable.firefinch_jameson_1j,
            R.drawable.firefinch_jameson_1j,
            R.raw.nocall
        )
        birdList.add(q200)

        val q201 = Birds(201,
            "Firefinch Red-billed",
            "Red-billed Firefinch","Lagonosticta senegala",
            R.drawable.firefinch_redbilled_1j,
            R.drawable.firefinch_redbilled_2j,
            R.drawable.firefinch_redbilled_3j,
            R.drawable.firefinch_redbilled_4j,
            R.drawable.firefinch_redbilled_5j,
            R.raw.nocall
        )
        birdList.add(q201)

        val q202 = Birds(202,
            "Fiscal Southern",
            "Southern Fiscal","Lanius collaris",
            R.drawable.fiscal_southern_1l,
            R.drawable.fiscal_southern_2l,
            R.drawable.fiscal_southern_1l,
            R.drawable.fiscal_southern_2l,
            R.drawable.fiscal_southern_1l,
            R.raw.nocall
        )
        birdList.add(q202)

        val q203= Birds(203,
            "Flamingo Greater",
            "Greater Flamingo","Phoenicopterus roseus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q203)

        val q204= Birds(204,
            "Flamingo Lesser",
            "Lesser Flamingo","Phoenicopterus minor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q204)

        val q205 = Birds(205,
            "Flufftail Buff-spotted",
            "Buff-spotted Flufftail","Sarothrura elegans",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q205)

        val q206= Birds(206,
            "Flufftail Red-chested",
            "Red-chested Flufftail","Sarothrura rufa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q206)

        val q207 = Birds(207,
            "Flufftail Striped",
            "Striped Flufftail","Sarothrura affinis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q207)

        val q208= Birds(208,
            "Flufftail White-winged",
            "White-winged Flufftail","Sarothrura ayresi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q208)

        val q209= Birds(209,
            "Flycatcher African Dusky",
            "African Dusky Flycatcher","Muscicapa adusta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q209)

        val q210 = Birds(210,
            "Flycatcher African Paradise",
            "African Paradise Flycatcher","Terpsiphone viridis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q210)

        val q211 = Birds(211,
            "Flycatcher Ashy",
            "Ashy Flycatcher","Fraseria cinerascens",
            R.drawable.flycatcher_ashy_1l,
            R.drawable.flycatcher_ashy_1l,
            R.drawable.flycatcher_ashy_1l,
            R.drawable.flycatcher_ashy_1l,
            R.drawable.flycatcher_ashy_1l,
            R.raw.nocall
        )
        birdList.add(q211)

        val q212 = Birds(212,
            "Flycatcher Blue-mantled Crested",
            "Blue-mantled Crested Flycatcher","Elminia longicauda",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q212)

        val q213= Birds(213,
            "Flycatcher Chat",
            "Chat Flycatcher","Myrmecocichla cinnamomeiventris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q213)

        val q214 = Birds(214,
            "Flycatcher Fairy",
            "Fairy Flycatcher","Stiphrornis erythrothorax",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q214)

        val q215 = Birds(215,
            "Flycatcher Fiscal",
            "Fiscal Flycatcher","Lanius collaris",
            R.drawable.flycatcher_fiscal_1l,
            R.drawable.flycatcher_fiscal_1l,
            R.drawable.flycatcher_fiscal_1l,
            R.drawable.flycatcher_fiscal_1l,
            R.drawable.flycatcher_fiscal_1l,
            R.raw.nocall
        )
        birdList.add(q215)

        val q216 = Birds(216,
            "Flycatcher Grey Tit",
            "Grey Tit Flycatcher","Myioparus plumbeus",
            R.drawable.flycatcher_greytit_1j,
            R.drawable.flycatcher_greytit_2j,
            R.drawable.flycatcher_greytit_3j,
            R.drawable.flycatcher_greytit_2j,
            R.drawable.flycatcher_greytit_1j,
            R.raw.nocall
        )
        birdList.add(q216)

        val q217= Birds(217,
            "Flycatcher Marico",
            "Marico Flycatcher","Telophorus quadricolor",
            R.drawable.flycatcher_marico_1j,
            R.drawable.flycatcher_marico_2j,
            R.drawable.flycatcher_marico_1j,
            R.drawable.flycatcher_marico_2j,
            R.drawable.flycatcher_marico_1j,
            R.raw.nocall
        )
        birdList.add(q217)

        val q218= Birds(218,
            "Flycatcher Pale",
            "Pale Flycatcher","Bradornis pallidus",
            R.drawable.flycatcher_pale_1l,
            R.drawable.flycatcher_pale_1l,
            R.drawable.flycatcher_pale_1l,
            R.drawable.flycatcher_pale_1l,
            R.drawable.flycatcher_pale_1l,
            R.raw.nocall
        )
        birdList.add(q218)

        val q219 = Birds(219,
            "Flycatcher Southern Black",
            "Southern Black Flycatcher","Melaenornis pammelaina",
            R.drawable.flycatcher_souterhnblack_3j,
            R.drawable.flycatcher_souterhnblack_2j,
            R.drawable.flycatcher_souterhnblack_3j,
            R.drawable.flycatcher_souterhnblack_2j,
            R.drawable.flycatcher_souterhnblack_1l,
            R.raw.nocall
        )
        birdList.add(q219)

        val q220 = Birds(220,
            "Flycatcher Spotted",
            "Spotted Flycatcher","Muscicapa striata",
            R.drawable.flycatcher_spotted_1j,
            R.drawable.flycatcher_spotted_2j,
            R.drawable.flycatcher_spotted_3j,
            R.drawable.flycatcher_spotted_4j,
            R.drawable.flycatcher_spotted_5j,
            R.raw.nocall
        )
        birdList.add(q220)

        val q221= Birds(221,
            "Francolin Coqui",
            "Coqui Francolin","Peliperdix coqui",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q221)

        val q222 = Birds(222,
            "Francolin Crested",
            "Crested Francolin","Dendroperdix sephaena",
            R.drawable.francolin_crested_1l,
            R.drawable.francolin_crested_2l,
            R.drawable.francolin_crested_1l,
            R.drawable.francolin_crested_1l,
            R.drawable.francolin_crested_2l,
            R.raw.nocall
        )
        birdList.add(q222)

        val q223 = Birds(223,
            "Francolin Grey-winged",
            "Grey-winged Francolin","Scleroptila africanus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q223)

        val q224 = Birds(224,
            "Francolin Orange River",
            "Orange River Francolin","Scleroptila levaillantoides",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q224)

        val q225 = Birds(225,
            "Francolin Red-winged",
            "Red-winged Francolin","Scleroptila erythroptera",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q225)

        val q226= Birds(226,
            "Francolin Shelley's",
            "Shelley's Francolin","Scleroptila shelleyi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q226)

        val q227= Birds(227,
            "Frigatebird Greater",
            "Greater Frigatebird","Fregata minor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q227)

        val q228= Birds(228,
            "Frigatebird Lesser",
            "Lesser Frigatebird","Fregata ariel",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q228)

        val q229 = Birds(229,
            "Gallinule Allen's",
            "Allen's Gallinule","Porphyrio alleni",
            R.drawable.gallinule_allen_1l,
            R.drawable.gallinule_allen_1l,
            R.drawable.gallinule_allen_1l,
            R.drawable.gallinule_allen_1l,
            R.drawable.gallinule_allen_1l,
            R.raw.nocall
        )
        birdList.add(q229)

        val q230= Birds(230,
            "Gannet Cape",
            "Cape Gannet","Morus capensis",
            R.drawable.gannet_cape_1l,
            R.drawable.gannet_cape_1l,
            R.drawable.gannet_cape_1l,
            R.drawable.gannet_cape_1l,
            R.drawable.gannet_cape_1l,
            R.raw.nocall
        )
        birdList.add(q230)

        val q231 = Birds(231,
            "Go-away-bird Grey",
            "Grey Go-away-bird","Corythaixoides concolor",
            R.drawable.grey_go_away_1j,
            R.drawable.grey_go_away_2j,
            R.drawable.grey_go_away_3j,
            R.drawable.grey_go_away_4j,
            R.drawable.grey_go_away_5j,
            R.raw.nocall
        )
        birdList.add(q231)

        val q232= Birds(232,
            "Godwit Bar-tailed",
            "Bar-tailed Godwit","Limosa lapponica",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q232)

        val q233 = Birds(233,
            "Goose African Pygmy",
            "African Pygmy Goose","Nettapus auritus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q233)

        val q234 = Birds(234,
            "Goose Egyptian",
            "Egyptian Goose","Alopochen aegyptiaca",
            R.drawable.goose_egyptian_1j,
            R.drawable.goose_egyptian_2j,
            R.drawable.goose_egyptian_3j,
            R.drawable.goose_egyptian_4j,
            R.drawable.goose_egyptian_5j,
            R.raw.nocall
        )
        birdList.add(q234)

        val q235= Birds(235,
            "Goose Spur-winged",
            "Spur-winged Goose","Plectropterus gambensis",
            R.drawable.goose_spurwing_1l,
            R.drawable.goose_spurwing_1l,
            R.drawable.goose_spurwing_1l,
            R.drawable.goose_spurwing_1l,
            R.drawable.goose_spurwing_1l,
            R.raw.nocall
        )
        birdList.add(q235)

        val q236= Birds(236,
            "Goshawk African",
            "African Goshawk","Accipiter tachiro",
            R.drawable.goshawk_african_1l,
            R.drawable.goshawk_african_1l,
            R.drawable.goshawk_african_1l,
            R.drawable.goshawk_african_1l,
            R.drawable.goshawk_african_1l,
            R.raw.nocall
        )
        birdList.add(q236)

        val q237 = Birds(237,
            "Goshawk Dark Chanting",
            "Dark Chanting Goshawk","Melierax metabates",
            R.drawable.goshawk_darkchanting_1j,
            R.drawable.goshawk_darkchanting_1j,
            R.drawable.goshawk_darkchanting_1j,
            R.drawable.goshawk_darkchanting_1j,
            R.drawable.goshawk_darkchanting_1j,
            R.raw.nocall
        )
        birdList.add(q237)

        val q238= Birds(238,
            "Goshawk Gabar",
            "Gabar Goshawk","Melierax gabar",
            R.drawable.goshawk_gabar_1l,
            R.drawable.goshawk_gabar_1l,
            R.drawable.goshawk_gabar_1l,
            R.drawable.goshawk_gabar_1l,
            R.drawable.goshawk_gabar_1l,
            R.raw.nocall
        )
        birdList.add(q238)


        val q239 = Birds(239,
            "Goshawk Pale Chanting",
            "Pale Chanting Goshawk","Melierax canorus",
            R.drawable.goshawk_palechanting_1j,
            R.drawable.goshawk_palechanting_2j,
            R.drawable.goshawk_palechanting_3j,
            R.drawable.goshawk_palechanting_2j,
            R.drawable.goshawk_palechanting_1j,
            R.raw.nocall
        )
        birdList.add(q239)

        val q240 = Birds(240,
            "Grassbird Cape",
            "Cape Grassbird","Sphenoeacus afer",
            R.drawable.grassbird_cape_1l,
            R.drawable.grassbird_cape_1l,
            R.drawable.grassbird_cape_1l,
            R.drawable.grassbird_cape_1l,
            R.drawable.grassbird_cape_1l,
            R.raw.nocall
        )
        birdList.add(q240)

        val q241= Birds(241,
            "Grassbird Fan-tailed",
            "Fan-tailed Grassbird","Schoenicola brevirostris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q241)

        val q242= Birds(242,
            "Grebe Black-necked",
            "Black-necked Grebe","Podiceps nigricollis",
            R.drawable.grebe_blacknecked_1l,
            R.drawable.grebe_blacknecked_1l,
            R.drawable.grebe_blacknecked_1l,
            R.drawable.grebe_blacknecked_1l,
            R.drawable.grebe_blacknecked_1l,
            R.raw.nocall
        )
        birdList.add(q242)

        val q243= Birds(243,
            "Grebe Great Crested",
            "Great Crested Grebe","Podiceps cristatus",
            R.drawable.grebe_greatcrested_1l,
            R.drawable.grebe_greatcrested_1l,
            R.drawable.grebe_greatcrested_1l,
            R.drawable.grebe_greatcrested_1l,
            R.drawable.grebe_greatcrested_1l,
            R.raw.nocall
        )
        birdList.add(q243)

        val q244 = Birds(244,
            "Grebe Little",
            "Little Grebe","Tachybaptus ruficollis",
            R.drawable.grebe_little_1l,
            R.drawable.grebe_little_2j,
            R.drawable.grebe_little_1l,
            R.drawable.grebe_little_2j,
            R.drawable.grebe_little_1l,
            R.raw.nocall
        )
        birdList.add(q244)

        val q245= Birds(245,
            "Greenbul Sombre",
            "Sombre Greenbul","Andropadus importunus",
            R.drawable.greenbull_sombre_1l,
            R.drawable.greenbull_sombre_1l,
            R.drawable.greenbull_sombre_1l,
            R.drawable.greenbull_sombre_1l,
            R.drawable.greenbull_sombre_1l,
            R.raw.nocall
        )
        birdList.add(q245)

        val q246 = Birds(246,
            "Greenbul Yellow-bellied",
            "Yellow-bellied Greenbul","Eurillas gracilis",
            R.drawable.greenbul_yellowbellied_1l,
            R.drawable.greenbul_yellowbellied_1l,
            R.drawable.greenbul_yellowbellied_1l,
            R.drawable.greenbul_yellowbellied_1l,
            R.drawable.greenbul_yellowbellied_1l,
            R.raw.nocall
        )
        birdList.add(q246)

        val q247= Birds(247,
            "Greenbul Yellow-streaked",
            "Yellow-streaked Greenbul","Eurillas latirostris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q247)

        val q248= Birds(248,
            "Greenshank Common",
            "Common Greenshank","Tringa nebularia",
            R.drawable.greenshank_common_1l,
            R.drawable.greenshank_common_2l,
            R.drawable.greenshank_common_1l,
            R.drawable.greenshank_common_1l,
            R.drawable.greenshank_common_2l,
            R.raw.nocall
        )
        birdList.add(q248)

        val q249= Birds(249,
            "Guineafowl Crested",
            "Crested Guineafowl","Guttera pucherani edouardi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q249)

        val q250= Birds(250,
            "Guineafowl Helmeted",
            "Helmeted Guineafowl","Numida meleagris",
            R.drawable.ginuefowl_helmeted_1j,
            R.drawable.ginuefowl_helmeted_2j,
            R.drawable.ginuefowl_helmeted_3j,
            R.drawable.ginuefowl_helmeted_2j,
            R.drawable.ginuefowl_helmeted_1j,
            R.raw.nocall
        )
        birdList.add(q250)

        val q251= Birds(251,
            "Gull Black-headed",
            "Black-headed Gull","Larus ridibundus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q251)

        val q252 = Birds(252,
            "Gull Grey-headed",
            "Grey-headed Gull","Larus cirrocephalus",
            R.drawable.gull_greyheaded_1l,
            R.drawable.gull_greyheaded_2l,
            R.drawable.gull_greyheaded_1l,
            R.drawable.gull_greyheaded_1l,
            R.drawable.gull_greyheaded_2l,
            R.raw.nocall
        )
        birdList.add(q252)

        val q253 = Birds(253,
            "Gull Hartlaub’s",
            "Hartlaub’s Gull","Larus hartlaubii",
            R.drawable.gull_hartlaub_1l,
            R.drawable.gull_hartlaub_1l,
            R.drawable.gull_hartlaub_1l,
            R.drawable.gull_hartlaub_1l,
            R.drawable.gull_hartlaub_1l,
            R.raw.nocall
        )
        birdList.add(q253)

        val q254= Birds(254,
            "Gull Kelp",
            "Kelp Gull","Larus dominicanus",
            R.drawable.gull_kelp_1l,
            R.drawable.gull_kelp_1l,
            R.drawable.gull_kelp_1l,
            R.drawable.gull_kelp_1l,
            R.drawable.gull_kelp_1l,
            R.raw.nocall
        )
        birdList.add(q254)

        val q255= Birds(255,
            "Hamerkop",
            "Hamerkop","Scopus umbretta",
            R.drawable.hamerkop_1j,
            R.drawable.hamerkop_2j,
            R.drawable.hamerkop_3j,
            R.drawable.hamerkop_4j,
            R.drawable.hamerkop_1j,
            R.raw.nocall
        )
        birdList.add(q255)

        val q256 = Birds(256,
            "Harrier African Marsh",
            "African Marsh Harrier","Circus ranivorus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q256)

        val q257= Birds(257,
            "Harrier Black",
            "Black Harrier","Circus maurus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q257)

        val q258= Birds(258,
            "Harrier Montagu's",
            "Montagu's Harrier","Circus pygargus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q258)

        val q259= Birds(259,
            "Harrier Pallid",
            "Pallid Harrier","Circus macrourus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q259)

        val q260= Birds(260,
            "Hawk African Cuckoo",
            "African Cuckoo Hawk","Aviceda cuculoides",
            R.drawable.hawk_africancuckoo_1j,
            R.drawable.hawk_africancuckoo_2j,
            R.drawable.hawk_africancuckoo_1j,
            R.drawable.hawk_africancuckoo_2j,
            R.drawable.hawk_africancuckoo_1j,
            R.raw.nocall
        )
        birdList.add(q260)

        val q261 = Birds(261,
            "Hawk African Harrier",
            "African Harrier Hawk","Polyboroides typus",
            R.drawable.hawk_africanharrier_1l,
            R.drawable.hawk_africanharrier_1l,
            R.drawable.hawk_africanharrier_1l,
            R.drawable.hawk_africanharrier_1l,
            R.drawable.hawk_africanharrier_1l,
            R.raw.nocall
        )
        birdList.add(q261)

        val q262 = Birds(262,
            "Hawk Bat",
            "Bat Hawk","Macheiramphus alcinus",
            R.drawable.hawk_bat_1l,
            R.drawable.hawk_bat_1l,
            R.drawable.hawk_bat_1l,
            R.drawable.hawk_bat_1l,
            R.drawable.hawk_bat_1l,
            R.raw.nocall
        )
        birdList.add(q262)

        val q263 = Birds(263,
            "Heron Black",
            "Black Heron","Egretta ardesiaca",
            R.drawable.heron_black_1j,
            R.drawable.heron_black_2j,
            R.drawable.heron_black_3j,
            R.drawable.heron_black_4j,
            R.drawable.heron_black_5j,
            R.raw.nocall
        )
        birdList.add(q263)

        val q264 = Birds(264,
            "Heron Black-crowned Night",
            "Black-crowned Night Heron","Nycticorax nycticorax",
            R.drawable.heron_blackcrowned_1j,
            R.drawable.heron_blackcrowned_2j,
            R.drawable.heron_blackcrowned_3j,
            R.drawable.heron_blackcrowned_4j,
            R.drawable.heron_blackcrowned_5j,
            R.raw.nocall
        )
        birdList.add(q264)

        val q265 = Birds(265,
            "Heron Black-headed",
            "Black-headed Heron","Ardea melanocephala",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q265)

        val q266 = Birds(266,
            "Heron Goliath",
            "Goliath Heron","Ardea goliath",
            R.drawable.heron_goliath_1j,
            R.drawable.heron_goliath_2j,
            R.drawable.heron_goliath_3j,
            R.drawable.heron_goliath_2j,
            R.drawable.heron_goliath_1j,
            R.raw.nocall
        )
        birdList.add(q266)

        val q267 = Birds(267,
            "Heron Green-backed",
            "Green-backed Heron","Butorides striata",
            R.drawable.heron_greenbacked_1j,
            R.drawable.heron_greenbacked_2j,
            R.drawable.heron_greenbacked_3j,
            R.drawable.heron_greenbacked_4j,
            R.drawable.heron_greenbacked_5j,
            R.raw.nocall
        )
        birdList.add(q267)

        val q268= Birds(268,
            "Heron Grey",
            "Grey Heron","Egretta cinerea",
            R.drawable.heron_grey_1j,
            R.drawable.heron_grey_2j,
            R.drawable.heron_grey_3j,
            R.drawable.heron_grey_4j,
            R.drawable.heron_grey_5j,
            R.raw.nocall
        )
        birdList.add(q268)

        val q269= Birds(269,
            "Heron Purple",
            "Purple Heron","Ardea purpurea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q269)

        val q270= Birds(270,
            "Heron Squacco",
            "Squacco Heron","Ardeola ralloides",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q270)

        val q271 = Birds(271,
            "Heron White-backed Night",
            "White-backed NightHeron","Gorsachius leuconotus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q271)

        val q272 = Birds(272,
            "Hobby Eurasian",
            "Eurasian Hobby","Falco subbuteo",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q272)

        val q273 = Birds(273,
            "Honeybird Brown-backed",
            "Brown-backed Honeyguide","Prodotiscus regulus",
            R.drawable.honeybird_brownbacked_1l,
            R.drawable.honeybird_brownbacked_1l,
            R.drawable.honeybird_brownbacked_1l,
            R.drawable.honeybird_brownbacked_1l,
            R.drawable.honeybird_brownbacked_1l,
            R.raw.nocall
        )
        birdList.add(q273)

        val q274= Birds(274,
            "Honeyguide Greater",
            "Greater Honeyguide","Indicator indicator",
            R.drawable.honeyguide_greater_1l,
            R.drawable.honeyguide_greater_1l,
            R.drawable.honeyguide_greater_1l,
            R.drawable.honeyguide_greater_1l,
            R.drawable.honeyguide_greater_1l,
            R.raw.nocall
        )
        birdList.add(q274)

        val q275 = Birds(275,
            "Honeyguide Lesser",
            "Lesser Honeyguide","Indicator minor",
            R.drawable.honeyguide_lesser_1l,
            R.drawable.honeyguide_lesser_1l,
            R.drawable.honeyguide_lesser_1l,
            R.drawable.honeyguide_lesser_1l,
            R.drawable.honeyguide_lesser_1l,
            R.raw.nocall
        )
        birdList.add(q275)

        val q276 = Birds(276,
            "Honeyguide Scaly-throated",
            "Scaly-throated Honeyguide","Indicator variegatus",
            R.drawable.honeyguide_scalythroated_1l,
            R.drawable.honeyguide_scalythroated_1l,
            R.drawable.honeyguide_scalythroated_1l,
            R.drawable.honeyguide_scalythroated_1l,
            R.drawable.honeyguide_scalythroated_1l,
            R.raw.nocall
        )
        birdList.add(q276)

        val q277 = Birds(277,
            "Hoopoe African",
            "African Hoopoe","Upupa africana",
            R.drawable.hoopoe_african_1l,
            R.drawable.hoopoe_african_2j,
            R.drawable.hoopoe_african_3j,
            R.drawable.hoopoe_african_2j,
            R.drawable.hoopoe_african_1l,
            R.raw.nocall
        )
        birdList.add(q277)

        val q278 = Birds(278,
            "Hornbill African Grey",
            "African Grey Hornbill","Lophoceros nasutus",
            R.drawable.hornbill_greybilled_1j,
            R.drawable.hornbill_greybilled_2j,
            R.drawable.hornbill_greybilled_3j,
            R.drawable.hornbill_greybilled_4j,
            R.drawable.hornbill_greybilled_5j,
            R.raw.nocall
        )
        birdList.add(q278)

        val q279 = Birds(279,
            "Hornbill Crowned",
            "Crowned Hornbill","Tockus alboterminatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q279)

        val q280= Birds(280,
            "Hornbill Southern Ground",
            "Southern Ground Hornbill","Bucorvus leadbeateri",
            R.drawable.hornbill_ground_1j,
            R.drawable.hornbill_ground_2j,
            R.drawable.hornbill_ground_3j,
            R.drawable.hornbill_ground_4j,
            R.drawable.hornbill_ground_5j,
            R.raw.nocall
        )
        birdList.add(q280)

        val q281 = Birds(281,
            "Hornbill Southern Red-billed",
            "Southern Red-billed Hornbill","Tockus rufirostris",
            R.drawable.hornbill_redbilled_1j,
            R.drawable.hornbill_redbilled_2j,
            R.drawable.hornbill_redbilled_1j,
            R.drawable.hornbill_redbilled_3j,
            R.drawable.hornbill_redbilled_2j,
            R.raw.nocall
        )
        birdList.add(q281)

        val q282 = Birds(282,
            "Hornbill Southern Yellow-billed",
            "Southern Yellow-billed Hornbill","Tockus flavirostris",
            R.drawable.hornbill_yellowbilled_1j,
            R.drawable.hornbill_yellowbilled_2j,
            R.drawable.hornbill_yellowbilled_3j,
            R.drawable.hornbill_yellowbilled_4j,
            R.drawable.hornbill_yellowbilled_5j,
            R.raw.nocall
        )
        birdList.add(q282)


        val q283= Birds(283,
            "Hornbill Trumpeter",
            "Trumpeter Hornbill","Bycanistes bucinator",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q283)

        val q284= Birds(284,
            "Ibis Sacred African",
            "Sacred African Ibis","Threskiornis aethiopicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q284)

        val q285 = Birds(285,
            "Ibis Glossy",
            "Glossy Ibis","Plegadis falcinellus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q285)

        val q286 = Birds(286,
            "Ibis Hadeda",
            "Hadeda Ibis","Bostrychia hagedash",
            R.drawable.ibis_hadeda_1l,
            R.drawable.ibis_hadeda_2j,
            R.drawable.ibis_hadeda_3j,
            R.drawable.ibis_hadeda_2j,
            R.drawable.ibis_hadeda_3j,
            R.raw.nocall)
        birdList.add(q286)

        val q287= Birds(287,
            "Ibis Southern Bald",
            "Southern Bald Ibis","Geronticus calvus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q287)

        val q288 = Birds(288,
            "Indigobird Dusky",
            "Dusky Indigobird","Vidua funerea",
            R.drawable.indigobird_dusky_1l,
            R.drawable.indigobird_dusky_1l,
            R.drawable.indigobird_dusky_1l,
            R.drawable.indigobird_dusky_1l,
            R.drawable.indigobird_dusky_1l,
            R.raw.nocall)
        birdList.add(q288)

        val q289= Birds(289,
            "Indigobird Purple",
            "Purple Indigobird","Vidua purpurascens",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q289)

        val q290= Birds(290,
            "Indigobird Village",
            "Village Indigobird","Vidua chalybeata",
            R.drawable.indigobird_village_1l,
            R.drawable.indigobird_village_1l,
            R.drawable.indigobird_village_1l,
            R.drawable.indigobird_village_1l,
            R.drawable.indigobird_village_1l,
            R.raw.nocall)
        birdList.add(q290)

        val q291= Birds(291,
            "Jacana African",
            "African Jacana","Actophilornis africanus",
            R.drawable.jacana_african_1j,
            R.drawable.jacana_african_2j,
            R.drawable.jacana_african_3j,
            R.drawable.jacana_african_4j,
            R.drawable.jacana_african_5j,
            R.raw.nocall)
        birdList.add(q291)

        val q292 = Birds(292,
            "Jacana Lesser",
            "Lesser Jacana","Hydrophasianus chirurgus",
            R.drawable.jacana_lesser_1l,
            R.drawable.jacana_lesser_1l,
            R.drawable.jacana_lesser_1l,
            R.drawable.jacana_lesser_1l,
            R.drawable.jacana_lesser_1l,
            R.raw.nocall)
        birdList.add(q292)

        val q293 = Birds(293,
            "Jaeger Long-tailed",
            "Long-tailed Jaeger","Stercorarius longicaudus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q293)

        val q294 = Birds(294,
            "Jaeger Parasitic",
            "Parasitic Jaeger","Stercorarius parasiticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q294)

        val q295 = Birds(295,
            "Jaeger Pomarine",
            "Pomarine Jaeger","Stercorarius pomarinus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q295)

        val q296 = Birds(296,
            "Kestrel Dickinson's",
            "Dickinson's Kestrel","Falco dickinsoni",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q296)

        val q297= Birds(297,
            "Kestrel Greater",
            "Greater Kestrel","Falco rupicoloides",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q297)

        val q298= Birds(298,
            "Kestrel Lesser",
            "Lesser Kestrel","Falco naumanni",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q298)

        val q299= Birds(299,
            "Kestrel Rock",
            "Rock Kestrel","Falco rufigularis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall)
        birdList.add(q299)

        val q300 = Birds(300,
            "Kingfisher African Pygmy",
            "African Pygmy Kingfisher","Ispidina lecontei",
            R.drawable.kingfisher_pygmy_1l,
            R.drawable.kingfisher_pygmy_1l,
            R.drawable.kingfisher_pygmy_1l,
            R.drawable.kingfisher_pygmy_1l,
            R.drawable.kingfisher_pygmy_1l,
            R.raw.nocall)
        birdList.add(q300)

        val q301 = Birds(301,
            "Kingfisher Brown-hooded",
            "Brown-hooded Kingfisher","Halcyon albiventris",
            R.drawable.kingfisher_brownhooded_1j,
            R.drawable.kingfisher_brownhooded_2j,
            R.drawable.kingfisher_brownhooded_3j,
            R.drawable.kingfisher_brownhooded_4j,
            R.drawable.kingfisher_brownhooded_5j,
            R.raw.nocall)
        birdList.add(q301)

        val q302 = Birds(302,
            "Kingfisher Giant",
            "Giant Kingfisher","Megaceryle maxima",
            R.drawable.kingfisher_gaint_1j,
            R.drawable.kingfisher_gaint_2l,
            R.drawable.kingfisher_gaint_2l,
            R.drawable.kingfisher_gaint_1j,
            R.drawable.kingfisher_gaint_1j,
            R.raw.nocall
        )
        birdList.add(q302)

        val q303 = Birds(303,
            "Kingfisher Grey-headed",
            "Grey-headed Kingfisher","Halcyon leucocephala",
            R.drawable.kingfisher_greyheaded_1j,
            R.drawable.kingfisher_greyheaded_2j,
            R.drawable.kingfisher_greyheaded_3j,
            R.drawable.kingfisher_greyheaded_4j,
            R.drawable.kingfisher_greyheaded_1j,
            R.raw.nocall
        )
        birdList.add(q303)

        val q304= Birds(304,
            "Kingfisher Half-collared",
            "Half-collared Kingfisher","Alcedo semitorquata",
            R.drawable.kingfisher_halfcollared_1l,
            R.drawable.kingfisher_halfcollared_1l,
            R.drawable.kingfisher_halfcollared_1l,
            R.drawable.kingfisher_halfcollared_1l,
            R.drawable.kingfisher_halfcollared_1l,
            R.raw.nocall
        )
        birdList.add(q304)

        val q305= Birds(305,
            "Kingfisher Malachite",
            "Malachite Kingfisher","Corythornis cristatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q305)

        val q306= Birds(306,
            "Kingfisher Mangrove",
            "Mangrove Kingfisher","Cerdycon mangrove",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q306)

        val q307= Birds(307,
            "Kingfisher Pied",
            "Pied Kingfisher","Ceryle rudis",
            R.drawable.kingfisher_pied_1j,
            R.drawable.kingfisher_pied_2j,
            R.drawable.kingfisher_pied_3j,
            R.drawable.kingfisher_pied_4j,
            R.drawable.kingfisher_pied_5j,
            R.raw.nocall
        )
        birdList.add(q307)

        val q308= Birds(308,
            "Kingfisher Striped",
            "Striped Kingfisher","Halcyon chelicuti",
            R.drawable.kingfisher_striped_1l,
            R.drawable.kingfisher_striped_1l,
            R.drawable.kingfisher_striped_1l,
            R.drawable.kingfisher_striped_1l,
            R.drawable.kingfisher_striped_1l,
            R.raw.nocall
        )
        birdList.add(q308)

        val q309= Birds(309,
            "Kingfisher Woodland",
            "Woodland Kingfisher","Halcyon senegalensis",
            R.drawable.kingfisher_woodlands_1j,
            R.drawable.kingfisher_woodlands_2j,
            R.drawable.kingfisher_woodlands_3j,
            R.drawable.kingfisher_woodlands_4j,
            R.drawable.kingfisher_woodlands_5j,
            R.raw.nocall
        )
        birdList.add(q309)

        val q310= Birds(310,
            "Kite Black",
            "Black Kite","Milvus migrans",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q310)

        val q311 = Birds(311,
            "Kite Black-winged",
            "Black-winged Kite","Milvus lineatus",
            R.drawable.kite_blackshouldered_1j,
            R.drawable.kite_blackshouldered_1j,
            R.drawable.kite_blackshouldered_1j,
            R.drawable.kite_blackshouldered_1j,
            R.drawable.kite_blackshouldered_1j,
            R.raw.nocall
        )
        birdList.add(q311)

        val q312 = Birds(312,
            "Kite Yellow-billed",
            "Yellow-billed Kite","Milvus aegyptius",
            R.drawable.kite_yellowbilled_1j,
            R.drawable.kite_yellowbilled_2j,
            R.drawable.kite_yellowbilled_3j,
            R.drawable.kite_yellowbilled_2j,
            R.drawable.kite_yellowbilled_1j,
            R.raw.nocall
        )
        birdList.add(q312)

        val q313 = Birds(313,
            "Knot Red",
            "Red Knot","Calidris canutus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q313)

        val q314 = Birds(314,
            "Korhaan Blue",
            "Blue Korhaan","Eupodotis caerulescens",
            R.drawable.korhaan_blue_1j,
            R.drawable.korhaan_blue_1j,
            R.drawable.korhaan_blue_1j,
            R.drawable.korhaan_blue_1j,
            R.drawable.korhaan_blue_1j,
            R.raw.nocall
        )
        birdList.add(q314)

        val q315 = Birds(315,
            "Korhaan Karoo",
            "Karoo Korhaan","Eupodotis vigorsii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q315)

        val q316 = Birds(316,
            "Korhaan Northern Black",
            "Northern Black Korhaan","Afrotis afraoides",
            R.drawable.korhaan_northenblack_1l,
            R.drawable.korhaan_nothernblack_2j,
            R.drawable.korhaan_northenblack_3j,
            R.drawable.korhaan_nothernblack_2j,
            R.drawable.korhaan_northenblack_1l,
            R.raw.nocall
        )
        birdList.add(q316)

        val q317= Birds(317,
            "Korhaan Red-crested",
            "Red-crested Korhaan","Lophotis ruficrista",
            R.drawable.korhaan_redcrested_1j,
            R.drawable.korhaan_redcrested_2j,
            R.drawable.korhaan_redcrested_3j,
            R.drawable.korhaan_redcrested_4j,
            R.drawable.korhaan_redcrested_5j,
            R.raw.nocall
        )
        birdList.add(q317)

        val q318 = Birds(318,
            "Korhaan Ruppel's",
            "Ruppel's Korhaan","Lophotis ruppelli",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q318)

        val q319 = Birds(319,
            "Korhaan Southern Black",
            "Southern Black Korhaan","Afrotis afra",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q319)



        val q320 = Birds(320,
            "Lapwing African Wattled",
            "African Wattled Lapwing","Vanellus senegallus",
            R.drawable.lapwing_africanwattled_1l,
            R.drawable.lapwing_africanwattled_2l,
            R.drawable.lapwing_africanwattled_1l,
            R.drawable.lapwing_africanwattled_2l,
            R.drawable.lapwing_africanwattled_1l,
            R.raw.nocall
        )
        birdList.add(q320)

        val q321 = Birds(321,
            "Lapwing Blacksmith",
            "Blacksmith Lapwing","Vanellus armatus",
            R.drawable.lapwing_blacksmith_1j,
            R.drawable.lapwing_blacksmith_2j,
            R.drawable.lapwing_blacksmith_3j,
            R.drawable.lapwing_blacksmith_4j,
            R.drawable.lapwing_blacksmith_5j,
            R.raw.nocall
        )
        birdList.add(q321)

        val q322 = Birds(322,
            "Lapwing Black-winged",
            "Black-winged Lapwing","Vanellus melanopterus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q322)

        val q323 = Birds(323,
            "Lapwing Crowned",
            "Crowned Lapwing","Vanellus coronatus",
            R.drawable.lapwing_crowned_1l,
            R.drawable.lapwing_crowned_2j,
            R.drawable.lapwing_crowned_1l,
            R.drawable.lapwing_crowned_2j,
            R.drawable.lapwing_crowned_1l,
            R.raw.nocall
        )
        birdList.add(q323)

        val q324 = Birds(324,
            "Lapwing Senegal",
            "Senegal Lapwing","Vanellus lugubris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q324)

        val q325 = Birds(325,
            "Lapwing White-crowned",
            "White-crowned Lapwing","Vanellus albiceps",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q325)

        val q326 = Birds(326,
            "Lark Agulhas Long-billed",
            "Agulhas Long-billed Lark","Certhilauda brevirostris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q326)

        val q327 = Birds(327,
            "Lark Barlow's",
            "Barlow'Lark","Calendulauda barlowi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q327)

        val q328 = Birds(328,
            "Lark Black-eared Sparrow",
            "Black-eared Sparrow Lark","Eremopterix australis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q328)

        val q329 = Birds(329,
            "Lark Botha's",
            "Botha's Lark","Ptyonoprogne cucullata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q329)

        val q330 = Birds(330,
            "Lark Cape Clapper",
            "Cape Clapper Lark","Mirafra apiata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q330)

        val q331 = Birds(331,
            "Lark Cape Long-billed",
            "Cape Long-billed Lark","Certhilauda curvirostris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q331)

        val q332 = Birds(332,
            "Lark Chestnut-backed Sparrow",
            "Chestnut-backed Sparrow Lark","Eremopterix leucotis",
            R.drawable.lark_chestnutbacked_1j,
            R.drawable.lark_chestnutbacked_2j,
            R.drawable.lark_chestnutbacked_1j,
            R.drawable.lark_chestnutbacked_2j,
            R.drawable.lark_chestnutbacked_1j,
            R.raw.nocall
        )
        birdList.add(q332)

        val q333 = Birds(333,
            "Lark Dune",
            "Dune Lark","Calendulauda erythrochlamys",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q333)

        val q334 = Birds(334,
            "Lark Dusky",
            "Dusky Lark","Pinarocorys nigricans",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q334)

        val q335 = Birds(335,
            "Lark Eastern Clapper",
            "Eastern Clapper Lark","Mirafra fasciolata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q335)

        val q336 = Birds(336,
            "Lark Eastern Long-billed",
            "Eastern Long-billed Lark","Certhilauda semitorquata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q336)

        val q337 = Birds(337,
            "Lark Fawn-coloured",
            "Fawn-coloured Lark","Calendulauda africanoides",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q337)

        val q338 = Birds(338,
            "Lark Flappet",
            "Flappet Lark","Calandrella cinerea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q338)

        val q339 = Birds(339,
            "Lark Grey-backed Sparrow",
            "Grey-backed Sparrow Lark","Eremopterix verticalis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q339)

        val q340 = Birds(340,
            "Lark Karoo",
            "Karoo Lark","Calendulauda albescens",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q340)

        val q341 = Birds(241,
            "Lark Karoo Long-billed",
            "Karoo Long-billed Lark","Certhilauda subcoronata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q341)

        val q342 = Birds(242,
            "Lark Large-billed",
            "Large-billed Lark","Ptyonoprogne fuliginosa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q342)

        val q343 = Birds(343,
            "Lark Melodious",
            "Melodious Lark"," Lullula arborea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q343)

        val q344 = Birds(344,
            "Lark Monotonous",
            "Monotonous Lark","Mirafra passerina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q344)

        val q345 = Birds(345,
            "Lark Pink-billed",
            "Pink-billed Lark","Calendulauda bella",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q345)

        val q346 = Birds(346,
            "Lark Red",
            "Red Lark","Certhilauda erythrochlamys",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q346)

        val q347 = Birds(347,
            "Lark Red-capped",
            "Red-capped Lark","Calandrella cinerea",
            R.drawable.lark_redcapped_1l,
            R.drawable.lark_redcapped_1l,
            R.drawable.lark_redcapped_1l,
            R.drawable.lark_redcapped_1l,
            R.drawable.lark_redcapped_1l,
            R.raw.nocall
        )
        birdList.add(q347)

        val q348 = Birds(348,
            "Lark Rudd's",
            "Rudd's Lark","Heteromirafra ruddi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q348)

        val q349 = Birds(349,
            "Lark Rufous-naped",
            "Rufous-naped Lark","Mirafra africana",
            R.drawable.lark_rufousnaped_1l,
            R.drawable.lark_rufousnaped_2j,
            R.drawable.lark_rufousnaped_1l,
            R.drawable.lark_rufousnaped_2j,
            R.drawable.lark_rufousnaped_2j,
            R.raw.nocall
        )
        birdList.add(q349)

        val q350 = Birds(350,
            "Lark Sabota",
            "Sabota Lark","Certhilauda sabota",
            R.drawable.lark_sabota_1j,
            R.drawable.lark_sabota_2j,
            R.drawable.lark_sabota_3j,
            R.drawable.lark_sabota_4j,
            R.drawable.lark_sabota_5j,
            R.raw.nocall
        )
        birdList.add(q350)

        val q351 = Birds(351,
            "Lark Sclater's",
            "Sclater's Lark","Pinarocorys sclateri",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q351)

        val q352 = Birds(352,
            "Lark Short-clawed",
            "Short-clawed Lark","Certhilauda chuana",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q352)

        val q353 = Birds(353,
            "Lark Spike-Heeled",
            "Spike-Heeled Lark","Chersomanes albofasciata",
            R.drawable.lark_spikeheeled_1l,
            R.drawable.lark_spikeheeled_1l,
            R.drawable.lark_spikeheeled_1l,
            R.drawable.lark_spikeheeled_1l,
            R.drawable.lark_spikeheeled_1l,
            R.raw.nocall
        )
        birdList.add(q353)

        val q354 = Birds(354,
            "Longclaw Cape",
            "Cape Longclaw","Macronyx capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q354)

        val q355 = Birds(355,
            "Longclaw Yellow-throated",
            "Yellow-throated Longclaw","Macronyx croceus",
            R.drawable.longclaw_yellowthroated_1j,
            R.drawable.longclaw_yellowthroated_2j,
            R.drawable.longclaw_yellowthroated_1j,
            R.drawable.longclaw_yellowthroated_2j,
            R.drawable.longclaw_yellowthroated_1j,
            R.raw.nocall
        )
        birdList.add(q355)

        val q356 = Birds(356,
            "Malkoha Green",
            "Green Malkoha","Zenaida hartlaub",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q356)

        val q357 = Birds(357,
            "Mannikin Bronze",
            "Bronze Mannikin","Spermestes cucullata",
            R.drawable.mannikin_bronze_1l,
            R.drawable.mannikin_bronze_1l,
            R.drawable.mannikin_bronze_1l,
            R.drawable.mannikin_bronze_1l,
            R.drawable.mannikin_bronze_1l,
            R.raw.nocall
        )
        birdList.add(q357)

        val q358 = Birds(358,
            "Mannikin Magpie",
            "Magpie Mannikin","Lonchura fringilloides",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q358)

        val q359 = Birds(359,
            "Mannikin Red-backed",
            "Red-backed Mannikin","Spermestes nigriceps",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q359)

        val q360 = Birds(360,
            "Martin Banded",
            "Banded Martin","Riparia cincta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q360)

        val q361 = Birds(361,
            "Martin Brown-throated",
            "Brown-throated Martin","Riparia paludicola",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q361)

        val q362 = Birds(362,
            "Martin Common House",
            "Common House Martin","Delichon urbicum",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q362)

        val q363 = Birds(363,
            "Martin Rock",
            "Rock Martin","Hirundo fuligula",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q363)

        val q364 = Birds(364,
            "Moorhen Common",
            "Common Moorhen","Gallinula chloropus",
            R.drawable.moorhen_common_1j,
            R.drawable.moorhen_common_2j,
            R.drawable.moorhen_common_3j,
            R.drawable.moorhen_common_4j,
            R.drawable.moorhen_common_5j,
            R.raw.nocall
        )
        birdList.add(q364)

        val q365 = Birds(365,
            "Moorhen Lesser",
            "Lesser Moorhen","Porphyrio alleni",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q365)

        val q366 = Birds(366,
            "Mousebird Red-faced",
            "Red-faced Mousebird","Urocolius indicus",
            R.drawable.mousebird_redfaced_1l,
            R.drawable.mousebird_redfaced_1l,
            R.drawable.mousebird_redfaced_1l,
            R.drawable.mousebird_redfaced_1l,
            R.drawable.mousebird_redfaced_1l,
            R.raw.nocall
        )
        birdList.add(q366)

        val q367 = Birds(367,
            "Mousebird Speckled",
            "Speckled Mousebird","Colius striatus",
            R.drawable.mousebird_speckled_1l,
            R.drawable.mousebird_speckled_1l,
            R.drawable.mousebird_speckled_1l,
            R.drawable.mousebird_speckled_1l,
            R.drawable.mousebird_speckled_1l,
            R.raw.nocall
        )
        birdList.add(q367)

        val q368 = Birds(368,
            "Mousebird White-backed",
            "White-backed Mousebird","Colius colius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q368)

        val q369 = Birds(369,
            "Neddicky",
            "Neddicky","Cossypha natalensis",
            R.drawable.neddicky_2j,
            R.drawable.neddicky_1j,
            R.drawable.neddicky_2j,
            R.drawable.neddicky_1j,
            R.drawable.neddicky_2j,
            R.raw.nocall
        )
        birdList.add(q369)

        val q370 = Birds(370,
            "Nicator Eastern",
            "Eastern Nicator","Nicator gularis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q370)

        val q371 = Birds(371,
            "Nightjar European",
            "European Nightjar","Caprimulgus europaeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q371)

        val q372 = Birds(372,
            "Nightjar Fiery-necked",
            "Fiery-necked Nightjar","Caprimulgus pectoralis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q372)

        val q373 = Birds(373,
            "Nightjar Freckled",
            "Freckled Nightjar","Caprimulgus tristigma",
            R.drawable.nigthjar_fierynecked_1l,
            R.drawable.nigthjar_fierynecked_1l,
            R.drawable.nigthjar_fierynecked_1l,
            R.drawable.nigthjar_fierynecked_1l,
            R.drawable.nigthjar_fierynecked_1l,
            R.raw.nocall
        )
        birdList.add(q373)

        val q374 = Birds(374,
            "Nightjar Pennant-winged",
            "Pennant-winged Nightjar","Caprimulgus vexillarius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q374)

        val q375 = Birds(375,
            "Nightjar Rufous-cheeked",
            "Rufous-cheeked Nightjar","Caprimulgus rufigena",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q375)

        val q376 = Birds(376,
            "Nightjar Square-tailed",
            "Square-tailed Nightjar","Caprimulgus fossii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q376)

        val q377 = Birds(377,
            "Nightjar Swamp",
            "Swamp Nightjar","Caprimulgus natalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q377)

        val q378 = Birds(378,
            "Openbill African",
            "African Openbill","Anastomus lamelligerus",
            R.drawable.openbill_african_1j,
            R.drawable.openbill_african_2j,
            R.drawable.openbill_african_3j,
            R.drawable.openbill_african_4j,
            R.drawable.openbill_african_5j,
            R.raw.nocall
        )
        birdList.add(q378)

        val q379 = Birds(379,
            "Oriole Black-headed",
            "Black-headed Oriole","Oriolus larvatus",
            R.drawable.oriole_blackheaded_1j,
            R.drawable.oriole_blackheaded_2j,
            R.drawable.oriole_blackheaded_1j,
            R.drawable.oriole_blackheaded_2j,
            R.drawable.oriole_blackheaded_1j,
            R.raw.nocall
        )
        birdList.add(q379)

        val q380 = Birds(380,
            "Oriole Eurasian Golden",
            "Eurasian Golden Oriole","Oriolus oriolus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q380)

        val q381 = Birds(381,
            "Osprey Western",
            "Western Osprey","Pandion haliaetus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q381)

        val q382 = Birds(382,
            "Ostrich Common",
            "Common Ostrich","Struthio camelus",
            R.drawable.ostrich_1j,
            R.drawable.ostrich_2j,
            R.drawable.ostrich_3j,
            R.drawable.ostrich_4j,
            R.drawable.ostrich_5j,
            R.raw.nocall
        )
        birdList.add(q382)

        val q383 = Birds(383,
            "Owl African Grass",
            "African Grass Owl","Tyto capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q383)

        val q384 = Birds(384,
            "Owl African Scops",
            "African Scops Owl","Otus senegalensis",
            R.drawable.owl_scops_1j,
            R.drawable.owl_scops_2j,
            R.drawable.owl_scops_1j,
            R.drawable.owl_scops_2j,
            R.drawable.owl_scops_1j,
            R.raw.nocall
        )
        birdList.add(q384)

        val q385 = Birds(385,
            "Owl African Wood",
            "African Wood Owl","Strix woodfordii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q385)

        val q386 = Birds(386,
            "Owl Cape Eagle",
            "Cape Eagle Owl","Bubo capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q386)

        val q387 = Birds(387,
            "Owl Marsh",
            "Marsh Owl","Owl Marsh - Asio capensis",
            R.drawable.owl_marsh_1l,
            R.drawable.owl_marsh_1l,
            R.drawable.owl_marsh_1l,
            R.drawable.owl_marsh_1l,
            R.drawable.owl_marsh_1l,
            R.raw.nocall
        )
        birdList.add(q387)

        val q388 = Birds(388,
            "Owl Pel's Fishing",
            "Pel's Fishing Owl","Scotopelia peli",
            R.drawable.owl_fishing_1l,
            R.drawable.owl_fishing_1l,
            R.drawable.owl_fishing_1l,
            R.drawable.owl_fishing_1l,
            R.drawable.owl_fishing_1l,
            R.raw.nocall
        )
        birdList.add(q388)

        val q389 = Birds(389,
            "Owl Southern White-faced",
            "Southern White-faced Owl","Ptilopsis granti",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q389)

        val q390 = Birds(390,
            "Owl Spotted Eagle",
            "Spotted Eagle Owl","Clanga clanga",
            R.drawable.owl_spottedeagle_1l,
            R.drawable.owl_spottedeagle_1l,
            R.drawable.owl_spottedeagle_1l,
            R.drawable.owl_spottedeagle_1l,
            R.drawable.owl_spottedeagle_1l,
            R.raw.nocall
        )
        birdList.add(q390)

        val q391 = Birds(391,
            "Owl Verreaux's Eagle",
            "Verreaux's Eagle Owl","Bubo lacteus",
            R.drawable.owl_verreauxeagle_1l,
            R.drawable.owl_verreauxeagle_2j,
            R.drawable.owl_verreauxeagle_3j,
            R.drawable.owl_verreauxeagle_2j,
            R.drawable.owl_verreauxeagle_1l,
            R.raw.nocall
        )
        birdList.add(q391)

        val q392 = Birds(392,
            "Owl Western Barn",
            "Barn Western Owl","Tyto alba",
            R.drawable.owl_barn_1l,
            R.drawable.owl_barn_1l,
            R.drawable.owl_barn_1l,
            R.drawable.owl_barn_1l,
            R.drawable.owl_barn_1l,
            R.raw.nocall
        )
        birdList.add(q392)

        val q393 = Birds(393,
            "Owlet African Barred",
            "African Barred Owlet","Glaucidium capense",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q393)

        val q394 = Birds(394,
            "Owlet Pearl-spotted",
            "Pearl-spotted Owlet","Glaucidium perlatum",
            R.drawable.owlet_pearlspotted_1j,
            R.drawable.owlet_pearlspotted_2j,
            R.drawable.owlet_pearlspotted_3j,
            R.drawable.owlet_pearlspotted_4j,
            R.drawable.owlet_pearlspotted_5j,
            R.raw.nocall
        )
        birdList.add(q394)

        val q395 = Birds(395,
            "Oxpecker Red-billed",
            "Red-billed Oxpecker","Buphagus erythrorynchus",
            R.drawable.oxpecker_redbilled_1j,
            R.drawable.oxpecker_redbilled_2j,
            R.drawable.oxpecker_redbilled_3j,
            R.drawable.oxpecker_redbilled_4j,
            R.drawable.oxpecker_redbilled_5j,
            R.raw.nocall
        )
        birdList.add(q395)

        val q396 = Birds(396,
            "Oxpecker Yellow-billed",
            "Yellow-billed Oxpecker","Buphagus africanus",
            R.drawable.oxpecker_yellowbilled_1j,
            R.drawable.oxpecker_yellowbilled_2j,
            R.drawable.oxpecker_yellowbilled_3j,
            R.drawable.oxpecker_yellowbilled_4j,
            R.drawable.oxpecker_yellowbilled_5j,
            R.raw.nocall
        )
        birdList.add(q396)

        val q397 = Birds(397,
            "Oystercatcher African",
            "African Oystercatcher","Haematopus moquini",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q397)

        val q398 = Birds(398,
            "Parrot Brown-headed",
            "Brown-headed Parrot","Poicephalus meyeri",
            R.drawable.parrot_brownheaded_1j,
            R.drawable.parrot_brownheaded_2j,
            R.drawable.parrot_brownheaded_3j,
            R.drawable.parrot_brownheaded_4j,
            R.drawable.parrot_brownheaded_5j,
            R.raw.nocall
        )
        birdList.add(q398)

        val q399 = Birds(399,
            "Parrot Brown-necked",
            "Brown-necked Parrot","Poicephalus fuscicollis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q399)

        val q400 = Birds(400,
            "Parrot Cape",
            "Cape Parrot","Poicephalus robustus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q400)


        val q401 = Birds(401,
            "Parrot Meyer's",
            "Meyer's Parrot","Poicephalus meyeri",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q401)

        val q402 = Birds(402,
            "Pelcian Great White",
            "Great White Pelcain","Pelecanus onocrotalus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q402)

        val q403 = Birds(403,
            "Pelican Pink-backed",
            "Pink-backed Pelican","Pelecanus rufescens",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q403)

        val q404 = Birds(404,
            "Penguin Adelie",
            "Adelie Penguin","Pygoscelis adeliae",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q404)

        val q405 = Birds(405,
            "Penguin African",
            "African Penguin","Spheniscus demersus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q405)

        val q406 = Birds(406,
            "Penguin Chinstrap",
            "Chinstrap Penguin","Pygoscelis antarcticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q406)

        val q407 = Birds(407,
            "Penguin Emperor",
            "Emperor Penguin","Aptenodytes forsteri",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q407)

        val q408 = Birds(408,
            "Penguin Gentoo",
            "Gentoo Penguin","Pygoscelis papua",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q408)

        val q409 = Birds(409,
            "Penguin King",
            "King Penguin","Aptenodytes patagonicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q409)

        val q410 = Birds(410,
            "Penguin Little",
            "Little Penguin","Eudyptula minor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q410)

        val q411 = Birds(411,
            "Penguin Macaroni",
            "Macaroni Penguin","Eudyptes chrysolophus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q411)

        val q412 = Birds(412,
            "Penguin Magellanic",
            "Magellanic Penguin","Spheniscus magellanicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q412)

        val q413 = Birds(413,
            "Penguin Northen Rockhopper",
            "Northen Rockhopper Penguin","Eudyptes moseleyi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q413)

        val q414 = Birds(414,
            "Penguin Southern Rockhopper",
            "Southern Rockhopper Penguin","Eudyptes chrysocome",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q414)

        val q415 = Birds(415,
            "Petrel Black-bellied Storm",
            "Black-bellied Storm Petrel","Fregetta tropica",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q415)

        val q416 = Birds(416,
            "Petrel Cape",
            "Cape Petrel","Pelagodroma marina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q416)

        val q417 = Birds(417,
            "Petrel European Storm",
            "European Storm Petrel","Hydrobates pelagicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q417)

        val q418 = Birds(418,
            "Petrel Great-winged",
            "Great-winged Petrel","Pterodroma macroptera",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q418)

        val q419 = Birds(419,
            "Petrel Northen Giant",
            "Northen Giant Petrel","Macronectes halli",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q419)

        val q420 = Birds(420,
            "Petrel Southern Gaint",
            "Southern Gaint Petrel","Macronectes giganteus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q420)

        val q421 = Birds(421,
            "Petrel White-chinned",
            "White-chinned Petrel","Procellaria aequinoctialis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q421)

        val q422 = Birds(422,
            "Petrel Wilson's Storm",
            "Wilson's Storm Petrel","Oceanites oceanicus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q422)

        val q423 = Birds(423,
            "Phalarope Red",
            "Red Phalarope","Phalaropus fulicarius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q423)

        val q424 = Birds(424,
            "Phalarope Red-necked",
            "Red-necked Phalarope","Phalaropus lobatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q424)

        val q425 = Birds(425,
            "Pigeon African Green",
            "African Green Pigeon","Treron calvus",
            R.drawable.pigeon_africangreen_1j,
            R.drawable.pigeon_africangreen_2j,
            R.drawable.pigeon_africangreen_1j,
            R.drawable.pigeon_africangreen_2j,
            R.drawable.pigeon_africangreen_1j,

            R.raw.nocall
        )
        birdList.add(q425)

        val q426 = Birds(426,
            "Pigeon African Olive",
            "African Olive Pigeon","Columba arquatrix",
            R.drawable.pigeon_africanolive_1l,
            R.drawable.pigeon_africanolive_1l,
            R.drawable.pigeon_africanolive_1l,
            R.drawable.pigeon_africanolive_1l,
            R.drawable.pigeon_africanolive_1l,
            R.raw.nocall
        )
        birdList.add(q426)

        val q427 = Birds(427,
            "Pigeon Eastern Bronze-naped",
            "Eastern Bronze-naped Pigeon","Columba delegorguei",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q427)

        val q428 = Birds(428,
            "Pigeon Speckled",
            "Speckled Pigeon","Columba guinea",
            R.drawable.pigeon_speckled_1l,
            R.drawable.pigeon_speckled_1l,
            R.drawable.pigeon_speckled_1l,
            R.drawable.pigeon_speckled_1l,
            R.drawable.pigeon_speckled_1l,
            R.raw.nocall
        )
        birdList.add(q428)

        val q429= Birds(429,
            "Pipit African",
            "African Pipit","Anthus cinnamomeus",
            R.drawable.pipit_african_1l,
            R.drawable.pipit_african_1l,
            R.drawable.pipit_african_1l,
            R.drawable.pipit_african_1l,
            R.drawable.pipit_african_1l,
            R.raw.nocall
        )
        birdList.add(q429)

        val q430 = Birds(430,
            "Pipit African Rock",
            "African Rock Pipit","Anthus rufulus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q430)

        val q431 = Birds(431,
            "Pipit Buffy",
            "Buffy Pipit","Anthus vaalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q431)

        val q432 = Birds(432,
            "Pipit Bushveld",
            "Bushveld Pipit","Anthus caffer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q432)

        val q433 = Birds(433,
            "Pipit Long-billed",
            "Long-billed Pipit","Anthus similis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q433)

        val q434 = Birds(434,
            "Pipit Mountain",
            "Mountain Pipit","Anthus hoeschi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q434)

        val q435 = Birds(435,
            "Pipit Plain-backed",
            "Plain-backed Pipit","Anthus leucophrys",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q435)

        val q436 = Birds(436,
            "Pipit Short-tailed",
            "Short-tailed Pipit","Anthus brachyurus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q436)

        val q437 = Birds(437,
            "Pipit Striped",
            "Striped Pipit","Anthus lineiventris",
            R.drawable.pipit_striped_1l,
            R.drawable.pipit_striped_1l,
            R.drawable.pipit_striped_1l,
            R.drawable.pipit_striped_1l,
            R.drawable.pipit_striped_1l,
            R.raw.nocall
        )
        birdList.add(q437)

        val q438 = Birds(438,
            "Pipit Yellow-breasted",
            "Yellow-breasted Pipit","Anthus chloris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q438)

        val q439 = Birds(439,
            "Plover Caspian",
            "Caspian Plover","Pluvialis asiatica",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q439)

        val q440 = Birds(440,
            "Plover Chestnut-banded",
            "Chestnut-banded Plover","Vanellus arm",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q440)

        val q441 = Birds(441,
            "Plover Common Ringed",
            "Common Ringed Plover","Charadrius hiaticula",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q441)

        val q442 = Birds(442,
            "Plover Greater Sand",
            "Greater Sand Plover","Charadrius leschenaultii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q442)

        val q443 = Birds(443,
            "Plover Grey",
            "Grey Plover","Pluvialis squatarola",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q443)

        val q444 = Birds(444,
            "Plover Kittlitz's",
            "Kittlitz's Plover","Charadrius pecuarius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q444)

        val q445 = Birds(445,
            "Plover Lesser Sand",
            "Lesser Sand Plover","Charadrius mongolus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q445)

        val q446 = Birds(446,
            "Plover Three-banded",
            "Three-banded Plover","Charadrius tricollaris",
            R.drawable.plover_threebanded_1j,
            R.drawable.plover_threebanded_1j,
            R.drawable.plover_threebanded_1j,
            R.drawable.plover_threebanded_1j,
            R.drawable.plover_threebanded_1j,
            R.raw.nocall
        )
        birdList.add(q446)

        val q447= Birds(447,
            "Plover White-fronted",
            "White-fronted Plover","Charadrius marginatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q447)

        val q448 = Birds(448,
            "Pochard Southern",
            "Southern Pochard","Aythya affinis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q448)

        val q449 = Birds(449,
            "Pratincole Black-winged",
            "Black-winged Pratincole","Glareola nordmanni",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q449)

        val q450= Birds(450,
            "Pratincole Collared",
            "Collared Pratincole","Glareola pratincola",
            R.drawable.pratincole_collared_1j,
            R.drawable.pratincole_collared_1j,
            R.drawable.pratincole_collared_1j,
            R.drawable.pratincole_collared_1j,
            R.drawable.pratincole_collared_1j,
            R.raw.nocall
        )
        birdList.add(q450)

        val q451 = Birds(451,
            "Prinia Black-chested",
            "Black-chested Prinia","Prinia flavicans",
            R.drawable.prinia_blackchested_1l,
            R.drawable.prinia_blackchested_1l,
            R.drawable.prinia_blackchested_1l,
            R.drawable.prinia_blackchested_1l,
            R.drawable.prinia_blackchested_1l,
            R.raw.nocall
        )
        birdList.add(q451)

        val q452 = Birds(452,
            "Prinia Drakensberg",
            "Drakensberg Prinia","Prinia hypoxantha",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q452)

        val q453 = Birds(453,
            "Prinia Karoo",
            "Karoo Prinia","Prinia maculosa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q453)

        val q454 = Birds(454,
            "Prinia Tawny-flanked",
            "Tawny-flanked Prinia","Prinia subflava",
            R.drawable.prinia_tawny_1j,
            R.drawable.prinia_tawny_2j,
            R.drawable.prinia_tawny_3j,
            R.drawable.prinia_tawny_4j,
            R.drawable.prinia_tawny_5j,
            R.raw.nocall
        )
        birdList.add(q454)

        val q455 = Birds(455,
            "Prion Antartic",
            "Antartic Prion","Pachyptila desolata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q455)

        val q456 = Birds(456,
            "Puffback black-backed",
            "Black-backed Puffback","Dryoscopus cubla",
            R.drawable.puffback_blackbacked_1j,
            R.drawable.puffback_blackbacked_2j,
            R.drawable.puffback_blackbacked_3j,
            R.drawable.puffback_blackbacked_2j,
            R.drawable.puffback_blackbacked_1j,
            R.raw.nocall
        )
        birdList.add(q456)

        val q457 = Birds(457,
            "Pytilia Green-winged",
            "Green-winged Pytilia","Pytilia melba",
            R.drawable.pytilia_greenwinged_1j,
            R.drawable.pytilia_greenwinged_1j,
            R.drawable.pytilia_greenwinged_1j,
            R.drawable.pytilia_greenwinged_2j,
            R.drawable.pytilia_greenwinged_2j,

            R.raw.nocall
        )
        birdList.add(q457)

        val q458 = Birds(458,
            "Quail Common",
            "Common Quail","Coturnix coturnix",
            R.drawable.quail_common_1l,
            R.drawable.quail_common_1l,
            R.drawable.quail_common_1l,
            R.drawable.quail_common_1l,
            R.drawable.quail_common_1l,
            R.raw.nocall
        )
        birdList.add(q458)

        val q459 = Birds(459,
            "Quail Harlequin",
            "Harlequin Quail","Synoicus chinensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q459)

        val q460 = Birds(460,
            "Quelea Red-billed",
            "Red-billed Quelea","Quelea quelea",
            R.drawable.quelia_redbilled_1j,
            R.drawable.quelia_redbilled_2j,
            R.drawable.quelia_redbilled_3j,
            R.drawable.quelia_redbilled_2j,
            R.drawable.quelia_redbilled_1j,
            R.raw.nocall
        )
        birdList.add(q460)

        val q461= Birds(461,
            "Quelea Red-headed",
            "Red-headed Quelea","Quelea erythrops",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q461)

        val q462 = Birds(462,
            "Rail African",
            "African Rail","Rallus caerulescens",
            R.drawable.rail_african_1l,
            R.drawable.rail_african_1l,
            R.drawable.rail_african_1l,
            R.drawable.rail_african_1l,
            R.drawable.rail_african_1l,
            R.raw.nocall
        )
        birdList.add(q462)

        val q463= Birds(463,
            "Raven White-necked",
            "White-necked Raven","Corvus albicollis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q463)

        val q464 = Birds(464,
            "Redshank Spotted",
            "Spotted Redshank","Tringa erythropus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q464)

        val q465 = Birds(465,
            "Robin Bearded Scrub",
            "Bearded Scrub Robin","Cercotrichas quadrivirgata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q465)

        val q466 = Birds(466,
            "Robin Brown Scrub",
            "Brown Scrub Robin","Cercotrichas signata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q466)

        val q467 = Birds(467,
            "Robin Kalahari Scrub",
            "Kalahari Scrub Robin","Cercotrichas paena",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q467)

        val q468 = Birds(468,
            "Robin Karoo Scrub",
            "Karoo Scrub Robin","Cercotrichas coryphaeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q468)

        val q469 = Birds(469,
            "Robin White-browed Scrub",
            "White-browed Scrub Robin","Cercotrichas leucophrys",
            R.drawable.robin_whitebrownscrub_1j,
            R.drawable.robin_whitebrownscrub_1j,
            R.drawable.robin_whitebrownscrub_1j,
            R.drawable.robin_whitebrownscrub_1j,
            R.drawable.robin_whitebrownscrub_1j,
            R.raw.nocall
        )
        birdList.add(q469)

        val q470 = Birds(470,
            "Robin White-starred",
            "White-starred Robin","Pogonocichla stellata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q470)

        val q471 = Birds(471,
            "Robin-Chat Cape",
            "Cape Robin-Chat","Cossypha caffra",
            R.drawable.robinchat_cape_1l,
            R.drawable.robinchat_cape_1l,
            R.drawable.robinchat_cape_1l,
            R.drawable.robinchat_cape_1l,
            R.drawable.robinchat_cape_1l,
            R.raw.nocall
        )
        birdList.add(q471)

        val q472 = Birds(472,
            "Robin-Chat Chorister",
            "Chorister Robin-Chat","Cossypha dichroa",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q472)

        val q473 = Birds(473,
            "Robin-Chat Red-capped",
            "Red-capped Robin-Chat","Cossypha natalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q473)

        val q474 = Birds(474,
            "Robin-Chat White-browed",
            "White-browed Robin-Chat","Cossypha heuglini",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q474)

        val q475 = Birds(475,
            "Robin-Chat White-throated",
            "White-throated Robin-Chat","Cossypha albicapilla",
            R.drawable.robinchat_whitethroated_1j,
            R.drawable.robinchat_whitethroated_2j,
            R.drawable.robinchat_whitethroated_3j,
            R.drawable.robinchat_whitethroated_4j,
            R.drawable.robinchat_whitethroated_5j,
            R.raw.nocall
        )
        birdList.add(q475)

        val q476 = Birds(476,
            "Rockjumper Cape",
            "Cape Rockjumper","Chaetops frenatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q476)

        val q477 = Birds(477,
            "Rockjumper Drakensberg",
            "Drakensberg Rockjumper","Chaetops pycnopygius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q477)

        val q478 = Birds(478,
            "Roller Broad-billed",
            "Broad-billed Roller","Eurystomus glaucurus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q478)

        val q479 = Birds(479,
            "Roller European",
            "European Roller","Coracias garrulus",
            R.drawable.roller_european_1j,
            R.drawable.roller_european_2j,
            R.drawable.roller_european_1j,
            R.drawable.roller_european_2j,
            R.drawable.roller_european_1j,
            R.raw.nocall
        )
        birdList.add(q479)

        val q480 = Birds(480,
            "Roller Lilac-breasted",
            "Lilac-breasted Roller","Coracias caudata",
            R.drawable.roller_lilacbreasted_1j,
            R.drawable.roller_lilacbreasted_2j,
            R.drawable.roller_lilacbreasted_3j,
            R.drawable.roller_lilacbreasted_4j,
            R.drawable.roller_lilacbreasted_5j,
            R.raw.nocall
        )
        birdList.add(q480)

        val q481 = Birds(481,
            "Roller Purple",
            "Purple Roller","Coracias naevius",
            R.drawable.roller_purple_1j,
            R.drawable.roller_purple_1j,
            R.drawable.roller_purple_1j,
            R.drawable.roller_purple_1j,
            R.drawable.roller_purple_1j,
            R.raw.nocall
        )
        birdList.add(q481)

        val q482 = Birds(482,
            "Roller Racket-tailed",
            "Racket-tailed Roller","Coracias spatulata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q482)

        val q483 = Birds(483,
            "Ruff",
            "Ruff","Calidris pugnax",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q483)

        val q484 = Birds(484,
            "Sanderling",
            "Sanderling","Calidris alba",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q484)

        val q485 = Birds(485,
            "Sandgrouse Burchell's",
            "Burchell's Sandgrouse","Pterocles burchelli",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q485)

        val q486 = Birds(486,
            "Sandgrouse Double-banded",
            "Double-banded Sandgrouse","Pterocles bicinctus",
            R.drawable.sandgrouse_doublebanded_1j,
            R.drawable.sandgrouse_doublebanded_2j,
            R.drawable.sandgrouse_doublebanded_3j,
            R.drawable.sandgrouse_doublebanded_4j,
            R.drawable.sandgrouse_doublebanded_5j,
            R.raw.nocall
        )
        birdList.add(q486)

        val q487 = Birds(487,
            "Sandgrouse Namaqua",
            "Namaqua Sandgrouse","Pterocles namaqua",
            R.drawable.sandgrouse_namaqau_j1,
            R.drawable.sandgrouse_namaqau_j1,
            R.drawable.sandgrouse_namaqau_j1,
            R.drawable.sandgrouse_namaqau_j1,
            R.drawable.sandgrouse_namaqau_j1,
            R.raw.nocall
        )
        birdList.add(q487)

        val q488 = Birds(488,
            "Sandgrouse Yellow-throated",
            "Yellow-throated Sandgrouse","Pterocles gutturalis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q488)

        val q489 = Birds(489,
            "Sandpiper Broad-billed",
            "Purple Roller","Limicola falcinellus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q489)

        val q490 = Birds(490,
            "Sandpiper Common",
            "Common Sandpiper","Actitis hypoleucos",
            R.drawable.sandpiper_common_1j,
            R.drawable.sandpiper_common_1j,
            R.drawable.sandpiper_common_1j,
            R.drawable.sandpiper_common_1j,
            R.drawable.sandpiper_common_1j,
            R.raw.nocall
        )
        birdList.add(q490)

        val q491 = Birds(491,
            "Sandpiper Curlew",
            "Curlew sandpiper","Calidris ferruginea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q491)

        val q492 = Birds(492,
            "Sandpiper Green",
            "Green Sandpiper","Tringa ochropus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q492)

        val q493 = Birds(493,
            "Sandpiper Marsh",
            "Marsh Sandpiper","Tringa stagnatilis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q493)

        val q494 = Birds(494,
            "Sandpiper Terek",
            "Terek Sandpiper","Xenus cinereus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q494)

        val q495 = Birds(495,
            "Sandpiper Wood",
            "Wood Sandpiper","Tringa glareola",
            R.drawable.sandpiper_wood_1j,
            R.drawable.sandpiper_wood_2j,
            R.drawable.sandpiper_wood_3j,
            R.drawable.sandpiper_wood_4j,
            R.drawable.sandpiper_wood_5j,
            R.raw.nocall
        )
        birdList.add(q495)

        val q496 = Birds(496,
            "Saw-wing Black",
            "Black Saw-wing","Swynnertonia swynnertoni",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q496)

        val q497 = Birds(497,
            "Scimitarbill Common",
            "Common Scimitarbill","Rhinopomastus cyanomelas",
            R.drawable.scimitarbill_1j,
            R.drawable.scimitarbill_1j,
            R.drawable.scimitarbill_1j,
            R.drawable.scimitarbill_1j,
            R.drawable.scimitarbill_1j,
            R.raw.nocall
        )
        birdList.add(q497)

        val q498 = Birds(498,
            "Secretarybird",
            "Secretarybird","Sagittarius serpentarius",
            R.drawable.seceratybird_1j,
            R.drawable.seceratybird_2j,
            R.drawable.seceratybird_3j,
            R.drawable.seceratybird_2j,
            R.drawable.seceratybird_1j,
            R.raw.nocall
        )
        birdList.add(q498)

        val q499 = Birds(499,
            "Seedeater Streaky-headed",
            "Streaky-headed Seedeater","Crithagra gularis",
            R.drawable.seedeater_streakyheaded_1l,
            R.drawable.seedeater_streakyheaded_1l,
            R.drawable.seedeater_streakyheaded_1l,
            R.drawable.seedeater_streakyheaded_1l,
            R.drawable.seedeater_streakyheaded_1l,
            R.raw.nocall
        )
        birdList.add(q499)

        val q500 = Birds(500,
            "Shearwater Cory's",
            "Cory's Shearwater","Calonectris diomedea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q500)

        val q501 = Birds(501,
            "Shearwater Flesh-footed",
            "Flesh-footed Shearwater","Puffinus carneipes",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q501)

        val q502 = Birds(502,
            "Shearwater Great",
            "Great Shearwater","Puffinus gravis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q502)

        val q503 = Birds(503,
            "Shearwater Sooty",
            "Sooty Shearwater","Puffinus griseus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q503)

        val q504 = Birds(504,
            "Shelduck South African",
            "South African Shelduck","Tadorna cana",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q504)

        val q505 = Birds(505,
            "Shikra",
            "Shikra","Accipiter badius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q505)

        val q506 = Birds(506,
            "Shoveler Cape",
            "Cape Shoveler","Spatula smithii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q506)

        val q507= Birds(507,
            "Shrike Crimson-breasted",
            "Crimson-breasted Shrike","Laniarius atrococcineus",
            R.drawable.shrike_crimsonbreasted_1l,
            R.drawable.shrike_crimsonbreasted_1l,
            R.drawable.shrike_crimsonbreasted_1l,
            R.drawable.shrike_crimsonbreasted_1l,
            R.drawable.shrike_crimsonbreasted_1l,
            R.raw.nocall
        )
        birdList.add(q507)

        val q508 = Birds(508,
            "Shrike Lesser Grey",
            "Lesser Grey Shrike","Lanius minor",
            R.drawable.shrike_lessergrey_1j,
            R.drawable.shrike_lessergrey_2j,
            R.drawable.shrike_lessergrey_1j,
            R.drawable.shrike_lessergrey_2j,
            R.drawable.shrike_lessergrey_1j,
            R.raw.nocall
        )
        birdList.add(q508)

        val q509 = Birds(509,
            "Shrike Magpie",
            "Magpie Shrike","Urolestes melanoleucus",
            R.drawable.shrike_magpie_1j,
            R.drawable.shrike_magpie_2j,
            R.drawable.shrike_magpie_3j,
            R.drawable.shrike_magpie_2j,
            R.drawable.shrike_magpie_1j,
            R.raw.nocall
        )
        birdList.add(q509)

        val q510 = Birds(510,
            "Shrike Red-backed",
            "Red-backed Shrike","Lanius collurio",
            R.drawable.shrike_redbacked_1l,
            R.drawable.shrike_redbacked_2j,
            R.drawable.shrike_redbacked_3j,
            R.drawable.shrike_redbacked_4j,
            R.drawable.shrike_redbacked_5j,
            R.raw.nocall
        )
        birdList.add(q510)

        val q511 = Birds(511,
            "Shrike Retz's Helmet",
            "Retz's Helmet Shrike","Prionops retzii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q511)

        val q512 = Birds(512,
            "Shrike Southern White-crowned",
            "Southern White-crowned Shrike","Eurocephalus anguitimens",
            R.drawable.shrike_southernwhitecrowned_1j,
            R.drawable.shrike_southernwhitecrowned_2j,
            R.drawable.shrike_southernwhitecrowned_3j,
            R.drawable.shrike_southernwhitecrowned_4j,
            R.drawable.shrike_southernwhitecrowned_5j,
            R.raw.nocall
        )
        birdList.add(q512)

        val q513 = Birds(513,
            "Shrike White-crested Helmet",
            "White-crested Helmet Shrike","Prionops plumatus",
            R.drawable.shrike_whitecrested_1j,
            R.drawable.shrike_whitecrested_2j,
            R.drawable.shrike_whitecrested_3j,
            R.drawable.shrike_whitecrested_4j,
            R.drawable.shrike_whitecrested_5j,
            R.raw.nocall
        )
        birdList.add(q513)

        val q514 = Birds(514,
            "Siskin Cape",
            "Cape Siskin","Carduelis pinus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q514)

        val q515 = Birds(515,
            "Siskin Drakensberg",
            "Drakensberg Siskin","Carduelis montana",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q515)

        val q516 = Birds(516,
            "Skua South Polar",
            "South Polar Skua","Stercorarius maccormicki",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q516)

        val q517 = Birds(517,
            "Skua Subantartic",
            "Subantartic Skua","Stercorarius antarcticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q517)

        val q518 = Birds(518,
            "Snipe African",
            "African Snipe","Gallinago nigripennis",
            R.drawable.snipe_african_1l,
            R.drawable.snipe_african_1l,
            R.drawable.snipe_african_1l,
            R.drawable.snipe_african_1l,
            R.drawable.snipe_african_1l,
            R.raw.nocall
        )
        birdList.add(q518)

        val q519= Birds(519,
            "Snipe Greater Painted",
            "Greater Painted Snipe","Rostratula benghalensis",
            R.drawable.snipe_greaterpainted_1j,
            R.drawable.snipe_greaterpainted_1j,
            R.drawable.snipe_greaterpainted_1j,
            R.drawable.snipe_greaterpainted_1j,
            R.drawable.snipe_greaterpainted_1j,
            R.raw.nocall
        )
        birdList.add(q519)

        val q520 = Birds(520,
            "Sparrow Cape",
            "Cape Sparrow","Passer melanurus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q520)

        val q521= Birds(521,
            "Sparrow Great",
            "Great Sparrow","Passer motitensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q521)

        val q522 = Birds(522,
            "Sparrow House",
            "House Sparrow","Passer domesticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q522)

        val q523 = Birds(523,
            "Sparrow Northern Grey-headed",
            "Northern Grey-headed Sparrow","Passer griseus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q523)

        val q524 = Birds(524,
            "Sparrow Southern Grey-headed",
            "Southern Grey-headed Sparrow","Passer diffusus",
            R.drawable.sparrow_southerngreyheaded_1j,
            R.drawable.sparrow_southerngreyheaded_2j,
            R.drawable.sparrow_southerngreyheaded_3j,
            R.drawable.sparrow_southerngreyheaded_4j,
            R.drawable.sparrow_southerngreyheaded_5j,
            R.raw.nocall
        )
        birdList.add(q524)

        val q525= Birds(525,
            "Sparrowhawk Black",
            "Black Sparrowhawk","Accipiter melanoleucus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q525)

        val q526 = Birds(526,
            "Sparrowhawk Little",
            "Little Sparrowhawk","Accipiter minullus",
            R.drawable.sparrowhawk_little_1l,
            R.drawable.sparrowhawk_little_1l,
            R.drawable.sparrowhawk_little_1l,
            R.drawable.sparrowhawk_little_1l,
            R.drawable.sparrowhawk_little_1l,
            R.raw.nocall
        )
        birdList.add(q526)

        val q527 = Birds(527,
            "Sparrowhawk Ovambo",
            "Ovambo Sparrowhawk","Accipiter ovampensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q527)


        val q528 = Birds(528,
            "Sparrowhawk Rufous-breasted",
            "Rufous-breasted Sparrowhawk","Accipiter rufiventris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q528)

        val q529 = Birds(529,
            "Spinetail Bohm",
            "Bohm Spinetail","Telacanthura ussheri",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q529)

        val q530 = Birds(530,
            "Spinetail Mottled",
            "Mottled Spinetail","Telacanthura melanopygia",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q530)

        val q531 = Birds(531,
            "Spoonbill African",
            "African Spoonbill","Platalea alba",
            R.drawable.spoonbill_african_1j,
            R.drawable.spoonbill_african_1j,
            R.drawable.spoonbill_african_1j,
            R.drawable.spoonbill_african_1j,
            R.drawable.spoonbill_african_1j,
            R.raw.nocall
        )
        birdList.add(q531)

        val q532 = Birds(532,
            "Spurfowl Cape",
            "Cape Spurfowl","Pternistis capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q532)

        val q533 = Birds(533,
            "Spurfowl Natal",
            "Natal Spurfowl","Pternistis natalensis",
            R.drawable.spurfowl_natal_1j,
            R.drawable.spurfowl_natal_2j,
            R.drawable.spurfowl_natal_3j,
            R.drawable.spurfowl_natal_4j,
            R.drawable.spurfowl_natal_1j,
            R.raw.nocall
        )
        birdList.add(q533)

        val q534 = Birds(534,
            "Spurfowl Red-billed",
            "Red-billed Spurfowl","Pternistis adspersus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q534)

        val q535= Birds(535,
            "Spurfowl Red-necked",
            "Red-necked Spurfowl","Pternistis afer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q535)

        val q536 = Birds(536,
            "Spurfowl Swainson's",
            "Swainson's Spurfowl","Pternistis swainsonii",
            R.drawable.spurfowl_swainson_1j,
            R.drawable.spurfowl_swainson_2j,
            R.drawable.spurfowl_swainson_3j,
            R.drawable.spurfowl_swainson_4j,
            R.drawable.spurfowl_swainson_5j,
            R.raw.nocall
        )
        birdList.add(q536)

        val q537 = Birds(537,
            "Starling Black-bellied",
            "Black-bellied Starling","Lamprotornis corruscus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q537)

        val q538 = Birds(538,
            "Starling Burchell's",
            "Burchell's Starling","Lamprotornis australis",
            R.drawable.starling_burchells_1j,
            R.drawable.starling_burchells_2j,
            R.drawable.starling_burchells_3j,
            R.drawable.starling_burchells_4j,
            R.drawable.starling_burchells_5j,
            R.raw.nocall
        )
        birdList.add(q538)

        val q539 = Birds(539,
            "Starling Cape",
            "Cape Starling","Lamprotornis nitens",
            R.drawable.starling_cape_1j,
            R.drawable.starling_cape_2j,
            R.drawable.starling_cape_3j,
            R.drawable.starling_cape_4j,
            R.drawable.starling_cape_5j,
            R.raw.nocall
        )
        birdList.add(q539)

        val q540= Birds(540,
            "Starling Common",
            "Common Starling","Sturnus vulgaris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q540)

        val q541 = Birds(541,
            "Starling Greater Blue-eared",
            "Greater Blue-eared Starling","Lamprotornis chalybaeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q541)

        val q542 = Birds(542,
            "Starling Meves's",
            "Meves's Starling","Lamprotornis mevesii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q542)

        val q543 = Birds(543,
            "Starling Pale-winged",
            "Pale-winged Starling","Onychognathus nabouroup",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q543)

        val q544 = Birds(544,
            "Starling Pied",
            "Pied Starling","Spreo bicolor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q544)

        val q545 = Birds(545,
            "Starling Red-winged",
            "Red-winged Starling","Onychognathus morio",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q545)

        val q546 = Birds(546,
            "Starling Violet-backed",
            "Violet-backed Starling","Cinnyricinclus leucogaster",
            R.drawable.starling_violetbacked_1j,
            R.drawable.starling_violetbacked_2j,
            R.drawable.starling_violetbacked_2j,
            R.drawable.starling_violetbacked_2j,
            R.drawable.starling_violetbacked_1j,
            R.raw.nocall
        )
        birdList.add(q546)

        val q547= Birds(547,
            "Starling Wattled",
            "Wattled Starling","Creatophora cinerea",
            R.drawable.starling_wattled_1j,
            R.drawable.starling_wattled_2j,
            R.drawable.starling_wattled_3j,
            R.drawable.starling_wattled_4j,
            R.drawable.starling_wattled_5j,
            R.raw.nocall
        )
        birdList.add(q547)

        val q548 = Birds(548,
            "Stilt Black-winged",
            "Black-winged Stilt","Himantopus himantopus",
            R.drawable.stilt_blackwinged_1j,
            R.drawable.stilt_blackwinged_2j,
            R.drawable.stilt_blackwinged_2j,
            R.drawable.stilt_blackwinged_2j,
            R.drawable.stilt_blackwinged_1j,
            R.raw.nocall
        )
        birdList.add(q548)

        val q549 = Birds(549,
            "Stint Little",
            "Little Stint","Calidris minuta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q549)

        val q550 = Birds(550,
            "Stonechat African",
            "African Stonechat","Saxicola torquatus",
            R.drawable.stonechat_african_1l,
            R.drawable.stonechat_african_1l,
            R.drawable.stonechat_african_1l,
            R.drawable.stonechat_african_1l,
            R.drawable.stonechat_african_1l,
            R.raw.nocall
        )
        birdList.add(q550)

        val q551 = Birds(551,
            "Stork Abdim's",
            "Abdim's Stork","Ciconia abdimii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q551)

        val q552 = Birds(552,
            "Stork Black",
            "Black Stork","Ciconia nigra",
            R.drawable.stork_black_1j,
            R.drawable.stork_black_2j,
            R.drawable.stork_black_3j,
            R.drawable.stork_black_4j,
            R.drawable.stork_black_5j,
            R.raw.nocall
        )
        birdList.add(q552)

        val q553 = Birds(553,
            "Stork Marabou",
            "Marabou Stork","Leptoptilos crumeniferus",
            R.drawable.stork_marabou_1j,
            R.drawable.stork_marabou_2j,
            R.drawable.stork_marabou_2j,
            R.drawable.stork_marabou_2j,
            R.drawable.stork_marabou_1j,
            R.raw.nocall
        )
        birdList.add(q553)

        val q554 = Birds(554,
            "Stork Saddle-billed",
            "Saddle-billed Stork","Ephippiorhynchus senegalensis",
            R.drawable.stork_saddlebilled_1j,
            R.drawable.stork_saddlebilled_2j,
            R.drawable.stork_saddlebilled_3j,
            R.drawable.stork_saddlebilled_4j,
            R.drawable.stork_saddlebilled_2j,
            R.raw.nocall
        )
        birdList.add(q554)

        val q555= Birds(555,
            "Stork White",
            "White Stork","Ciconia ciconia",
            R.drawable.stork_white_1j,
            R.drawable.stork_white_1j,
            R.drawable.stork_white_1j,
            R.drawable.stork_white_1j,
            R.drawable.stork_white_1j,
            R.raw.nocall
        )
        birdList.add(q555)

        val q556 = Birds(556,
            "Stork Wolly-necked",
            "Wolly-necked Stork","Ciconia episcopus",
            R.drawable.stork_woolynecked_1j,
            R.drawable.stork_woolynecked_2j,
            R.drawable.stork_woolynecked_2j,
            R.drawable.stork_woolynecked_2j,
            R.drawable.stork_woolynecked_1j,
            R.raw.nocall
        )
        birdList.add(q556)

        val q557 = Birds(557,
            "Stork Yellow-billed",
            "Yellow-billed Stork","Mycteria ibis",
            R.drawable.stork_yellowbilled_1j,
            R.drawable.stork_yellowbilled_2j,
            R.drawable.stork_yellowbilled_3j,
            R.drawable.stork_yellowbilled_4j,
            R.drawable.stork_yellowbilled_5j,
            R.raw.nocall
        )
        birdList.add(q557)

        val q558 = Birds(558,
            "Sugarbird Cape",
            "Cape Sugerbird","Promerops cafer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q558)

        val q559 = Birds(559,
            "Sugarbird Gurney's",
            "Gurney's Sugerbird","Promerops gurneyi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q559)

        val q560 = Birds(560,
            "Sunbird Amethyst",
            "Amethyst Sunbird","Chalcomitra amethystina",
            R.drawable.sunbird_amethyst_1l,
            R.drawable.sunbird_amethyst_1l,
            R.drawable.sunbird_amethyst_1l,
            R.drawable.sunbird_amethyst_1l,
            R.drawable.sunbird_amethyst_1l,
            R.raw.nocall
        )
        birdList.add(q560)

        val q561 = Birds(561,
            "Sunbird Collared",
            "Collared Sunbird","Hedydipna collaris",
            R.drawable.sunbird_collard_1l,
            R.drawable.sunbird_collard_1l,
            R.drawable.sunbird_collard_1l,
            R.drawable.sunbird_collard_1l,
            R.drawable.sunbird_collard_1l,
            R.raw.nocall
        )
        birdList.add(q561)

        val q562= Birds(562,
            "Sunbird Dusky",
            "Dusky Sunbird","Cinnyris fuscus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q562)


        val q563 = Birds(563,
            "Sunbird Greater Double-collared",
            "Greater Double-collared Sunbird","Cinnyris afer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q563)

        val q564 = Birds(654,
            "Sunbird Grey",
            "Grey Sunbird","Cinnyris cinnyris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q564)

        val q565 = Birds(656,
            "Sunbird Malachite",
            "Malachite Sunbird","Nectarinia famosa",
            R.drawable.sunbird_malachite_1l,
            R.drawable.sunbird_malachite_1l,
            R.drawable.sunbird_malachite_1l,
            R.drawable.sunbird_malachite_1l,
            R.drawable.sunbird_malachite_1l,
            R.raw.nocall
        )
        birdList.add(q565)

        val q566 = Birds(566,
            "Sunbird Marico",
            "Marico Sunbird","Cinnyris mariquensis",
            R.drawable.sunbird_marico_1j,
            R.drawable.sunbird_marico_2j,
            R.drawable.sunbird_marico_3j,
            R.drawable.sunbird_marico_2j,
            R.drawable.sunbird_marico_1j,
            R.raw.nocall
        )
        birdList.add(q566)

        val q567 = Birds(567,
            "Sunbird Neergaard's",
            "Neergaard's Sunbird","Nectarinia neergaardi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q567)

        val q568 = Birds(568,
            "Sunbird Olive",
            "Olive Sunbird","Cinnyris chloropygius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q568)

        val q569 = Birds(569,
            "Sunbird Orange-breasted",
            "Orange-breasted Sunbird","Nectarinia violacea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q569)

        val q570 = Birds(570,
            "Sunbird Plain-backed",
            "Plain-backed Sunbird","Anthobaphes violacea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q570)

        val q571 = Birds(571,
            "Sunbird Purple-banded",
            "Purple-banded Sunbird","Nectarinia bifasciata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q571)

        val q572 = Birds(572,
            "Sunbird Scarlet-Chested",
            "Scarlet-Chested Sunbird","Nectarinia senegalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q572)

        val q573 = Birds(573,
            "Sunbird Southern Double-collared",
            "Southern Double-collared Sunbird","Cinnyris chalybeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q573)

        val q574 = Birds(574,
            "Sunbird White-Bellied",
            "White-Bellied Sunbird","Nectarinia talatala",
            R.drawable.sunbird_whitebellied_1j,
            R.drawable.sunbird_whitebellied_1j,
            R.drawable.sunbird_whitebellied_1j,
            R.drawable.sunbird_whitebellied_1j,
            R.drawable.sunbird_whitebellied_1j,
            R.raw.nocall
        )
        birdList.add(q574)

        val q575 = Birds(575,
            "Swallow Barn",
            "Barn Swallow","Hirundo rustica",
            R.drawable.swallow_barn_1l,
            R.drawable.swallow_barn_1l,
            R.drawable.swallow_barn_1l,
            R.drawable.swallow_barn_1l,
            R.drawable.swallow_barn_1l,
            R.raw.nocall
        )
        birdList.add(q575)

        val q576 = Birds(576,
            "Swallow Blue",
            "Blue Swallow","Hirundo atrocaerulea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q576)

        val q577 = Birds(577,
            "Swallow Greater Striped",
            "Greater Striped Swallow","Cecropis daurica",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q577)

        val q578 = Birds(578,
            "Swallow Grey-rumped",
            "Grey-rumped Swallow","Pseudochelidon eurystomina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q578)

        val q579= Birds(579,
            "Swallow Lesser Striped",
            "Lesser Striped Swallow","Hirundo abyssinica",
            R.drawable.swallow_lesserstriped_1j,
            R.drawable.swallow_lesserstriped_2j,
            R.drawable.swallow_lesserstriped_1j,
            R.drawable.swallow_lesserstriped_2j,
            R.drawable.swallow_lesserstriped_1j,
            R.raw.nocall
        )
        birdList.add(q579)

        val q580 = Birds(580,
            "Swallow Mosque",
            "Mosque Swallow","Ptyonoprogne rufigula",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q580)

        val q581 = Birds(581,
            "Swallow Pearl-breasted",
            "Pearl-breasted Swallow","Ptyonoprogne concolor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q581)

        val q582 = Birds(582,
            "Swallow Red-breasted",
            "Red-breasted Swallow","Hirundo semirufa",
            R.drawable.swallow_redbreasted_1j,
            R.drawable.swallow_redbreasted_2j,
            R.drawable.swallow_redbreasted_3j,
            R.drawable.swallow_redbreasted_4j,
            R.drawable.swallow_redbreasted_1j,
            R.raw.nocall
        )
        birdList.add(q582)

        val q583 = Birds(583,
            "Swallow South African Cliff",
            "South African Cliff Swallow","Petrochelidon spilodera",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q583)

        val q584 = Birds(584,
            "Swallow White-throated",
            "White-throated Swallow","Hirundo albigularis",
            R.drawable.swallow_whitethroated_1,
            R.drawable.swallow_whitethroated_1,
            R.drawable.swallow_whitethroated_1,
            R.drawable.swallow_whitethroated_1,
            R.drawable.swallow_whitethroated_1,
            R.raw.nocall
        )
        birdList.add(q584)

        val q585 = Birds(585,
            "Swallow Wire-tailed",
            "Wire-tailed Swallow","Hirundo smithii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q585)

        val q586 = Birds(586,
            "Swamphen Africa",
            "Africa Swamphen","Porphyrio madagascariensis",
            R.drawable.swamphen_african_1l,
            R.drawable.swamphen_african_1l,
            R.drawable.swamphen_african_1l,
            R.drawable.swamphen_african_1l,
            R.drawable.swamphen_african_1l,
            R.raw.nocall
        )
        birdList.add(q586)

        val q587 = Birds(587,
            "Swift African Black",
            "African Black Swift","Apus barbatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q587)

        val q588 = Birds(588,
            "Swift African Palm",
            "African Palm Swift","Cypsiurus parvus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q588)

        val q589 = Birds(589,
            "Swift Alpine",
            "Alpine Swift","Tachymarptis melba",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q589)

        val q590= Birds(590,
            "Swift Common",
            "Common Swift","Apus apus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q590)

        val q591 = Birds(591,
            "Swift Horus",
            "Horus Swift","Apus horus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q591)

        val q592 = Birds(592,
            "Swift Little",
            "Little Swift","Apus affinis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q592)

        val q593 = Birds(593,
            "Swift White-rumped",
            "White-rumped Swift","Apus caffer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q593)

        val q594 = Birds(594,
            "Tchagra Black-crowned",
            "Black-crowned Tchagra","Tchagra senegala",
            R.drawable.tchagra_blackcrowned_1j,
            R.drawable.tchagra_blackcrowned_2j,
            R.drawable.tchagra_blackcrowned_3j,
            R.drawable.tchagra_blackcrowned_4j,
            R.drawable.tchagra_blackcrowned_5j,
            R.raw.nocall
        )
        birdList.add(q594)

        val q595 = Birds(595,
            "Tchagra Brown-crowned",
            "Brown-crowned Tchagra","chagra australis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q595)

        val q596 = Birds(596,
            "Tchagra Southern",
            "Southern Tchagra","Tchagra tchagr",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q596)

        val q597 = Birds(597,
            "Teal Cape",
            "Cape Teal","Anas capensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q597)

        val q598 = Birds(598,
            "Teal Hottentot",
            "Hottentot Teal","Anas hottentota",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q598)

        val q599 = Birds(599,
            "Teal Red-billed",
            "Red-billed Teal","Anas erythrorhyncha",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q599)

        val q600 = Birds(600,
            "Tern Antarctic",
            "Antarctic Tern","Thalasseus antarcticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q600)

        val q601 = Birds(601,
            "Tern Arctic",
            "Arctic Tern","Sterna paradisaea",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q601)

        val q602 = Birds(602,
            "Tern Black",
            "Black Tern","Chlidonias niger",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q602)

        val q603= Birds(603,
            "Tern Caspian",
            "Caspian Tern","Hydroprogne caspia",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q603)

        val q604 = Birds(604,
            "Tern Common",
            "Common Tern","Sterna hirundo",
            R.drawable.tern_common_1l,
            R.drawable.tern_common_1l,
            R.drawable.tern_common_1l,
            R.drawable.tern_common_1l,
            R.drawable.tern_common_1l,
            R.raw.nocall
        )
        birdList.add(q604)

        val q605 = Birds(605,
            "Tern Damara",
            "Damara Tern","Sterna balaenarum",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q605)

        val q606 = Birds(606,
            "Tern Lesser Crested",
            "Lesser Crested Tern","Thalasseus bengalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q606)

        val q607 = Birds(607,
            "Tern Little",
            "Little Tern","Sternula albifrons",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q607)

        val q608= Birds(608,
            "Tern Roseate",
            "Roseate Tern","Sterna dougallii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q608)

        val q609= Birds(609,
            "Tern Sandwich",
            "Sandwich Tern","Thalasseus sandvicensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q609)

        val q610 = Birds(610,
            "Tern Sooty",
            "Sooty Tern","Onychoprion fuscatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q610)

        val q611 = Birds(611,
            "Tern Swift",
            "Swift Tern","Thalasseus bergii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q611)

        val q612 = Birds(612,
            "Tern Whiskered",
            "Whiskered Tern","Chlidonias hybridus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q612)

        val q613 = Birds(613,
            "Tern White-winged",
            "White-winged Tern","Hydroprogne caspia",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q613)

        val q614 = Birds(614,
            "Thick-knee Spotted",
            "Spotted Thick-knee","Burhinus capensis",
            R.drawable.thickknee_spotted_1j,
            R.drawable.thickknee_spotted_3j,
            R.drawable.thickknee_spotted_2l,
            R.drawable.thickknee_spotted_3j,
            R.drawable.thickknee_spotted_2l,
            R.raw.nocall
        )
        birdList.add(q614)

        val q615= Birds(615,
            "Thick-knee Water",
            "Water Thick-knee","Burhinus vermiculatus",
            R.drawable.thickknee_water_1j,
            R.drawable.thickknee_water_2j,
            R.drawable.thickknee_water_3j,
            R.drawable.thickknee_water_4j,
            R.drawable.thickknee_water_5j,
            R.raw.nocall
        )
        birdList.add(q615)

        val q616 = Birds(616,
            "Thrush Cape Rock",
            "Cape Rock Thrush","Monticola rufocinereus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q616)

        val q617 = Birds(617,
            "Thrush Collared Palm",
            "Collared Palm Thrush","Cichladusa arquata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q617)

        val q618 = Birds(618,
            "Thrush Groundscraper",
            "Groundscraper Thrush","Psophocichla litsipsirupa",
            R.drawable.thrush_groundscraper_1l,
            R.drawable.thrush_groundscraper_1l,
            R.drawable.thrush_groundscraper_1l,
            R.drawable.thrush_groundscraper_1l,
            R.drawable.thrush_groundscraper_1l,
            R.raw.nocall
        )
        birdList.add(q618)

        val q619 = Birds(619,
            "Thrush Karoo",
            "Karoo Thrush","Turdus smithi",
            R.drawable.thrush_karoo_1l,
            R.drawable.thrush_karoo_1l,
            R.drawable.thrush_karoo_1l,
            R.drawable.thrush_karoo_1l,
            R.drawable.thrush_karoo_1l,
            R.raw.nocall
        )
        birdList.add(q619)

        val q620= Birds(620,
            "Thrush Kurrichane",
            "Kurrichane Thrush","Turdus libonyana",
            R.drawable.thrush_kurrichane_1l,
            R.drawable.thrush_kurrichane_1l,
            R.drawable.thrush_kurrichane_1l,
            R.drawable.thrush_kurrichane_1l,
            R.drawable.thrush_kurrichane_1l,
            R.raw.nocall
        )
        birdList.add(q620)

        val q621 = Birds(621,
            "Thrush Olive",
            "Olive Thrush","Turdus olivaceus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q621)

        val q622 = Birds(622,
            "Thrush Orange Ground",
            "Orange Ground Thrush","Cichladusa gutturalis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q622)

        val q623 = Birds(623,
            "Thrush Sentinel Rock",
            "Sentinel Rock Thrush","Monticola explorator",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q623)

        val q624 = Birds(624,
            "Thrush Short-toed Rock",
            "Short-toed Rock Thrush","Monticola brevipes",
            R.drawable.thrush_shorttoedrock_1l,
            R.drawable.thrush_shorttoedrock_1l,
            R.drawable.thrush_shorttoedrock_1l,
            R.drawable.thrush_shorttoedrock_1l,
            R.drawable.thrush_shorttoedrock_1l,
            R.raw.nocall
        )
        birdList.add(q624)

        val q625= Birds(625,
            "Thrush Spotted Ground",
            "Spotted Ground Thrush","Geokichla guttata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q625)

        val q626 = Birds(626,
            "Tinkerbird Red-fronted",
            "Red-fronted Tinkerbird","Pogoniulus pusillus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q626)

        val q627 = Birds(627,
            "Tinkerbird Yellow-fronted",
            "Yellow-fronted Tinkerbird","Pogoniulus chrysoconus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q627)

        val q628 = Birds(628,
            "Tinkerbird Yellow-rumped",
            "Yellow-rumped Tinkerbird","Pogoniulus bilineatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q628)

        val q629 = Birds(629,
            "Tit Ashy",
            "Ashy Tit","Melaniparus cinerascens",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q629)

        val q630 = Birds(630,
            "Tit Cape Penduline",
            "Cape Penduline Tit","Anthoscopus minutus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q630)

        val q631 = Birds(631,
            "Tit Grey",
            "Grey Tit","Parus afer",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q631)

        val q632= Birds(632,
            "Tit Grey Penduline",
            "Grey Penduline Tit","Anthoscopus caroli",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q632)

        val q633 = Birds(633,
            "Tit Southern Black",
            "Southern Black Tit","Melaniparus niger",
            R.drawable.tit_southernblack_1j,
            R.drawable.tit_southernblack_1j,
            R.drawable.tit_southernblack_1j,
            R.drawable.tit_southernblack_1j,
            R.drawable.tit_southernblack_1j,
            R.raw.nocall
        )
        birdList.add(q633)


        val q634 = Birds(634,
            "Trogon Narina",
            "Narina Trogon","Apaloderma narina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q634)

        val q635 = Birds(635,
            "Tropicbird Red-billed",
            "Red-billed Tropicalbird","Phaethon aethereus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q635)

        val q636 = Birds(636,
            "Tropicbird Red-tailed",
            "Red-tailed Tropicalbird","Phaethon rubricauda",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q636)

        val q637 = Birds(637,
            "Tropicbird White-tailed",
            "White-tailed Tropicalbird","Phaethon lepturus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q637)

        val q638 = Birds(638,
            "Turaco Knysna",
            "Knysna Turaco","Tauraco corythaix",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q638)

        val q639= Birds(639,
            "Turaco Livingstone's",
            "Livingstone's Turaco","Tauraco livingstonii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q639)

        val q640 = Birds(640,
            "Turaco Purple-crested",
            "Purple-crested Turaco","Tauraco porphyreolophus",
            R.drawable.turaco_purplecrested_1l,
            R.drawable.turaco_purplecrested_1l,
            R.drawable.turaco_purplecrested_1l,
            R.drawable.turaco_purplecrested_1l,
            R.drawable.turaco_purplecrested_1l,
            R.raw.nocall
        )
        birdList.add(q640)

        val q641 = Birds(641,
            "Turnstone Rubby",
            "Rubby Turnstone","Arenaria interpres",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q641)

        val q642 = Birds(642,
            "Twinspot Green",
            "Green Twinspot","Clytospiza pentlandii",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q642)

        val q643 = Birds(643,
            "Twinspot Pink-throated",
            "Pink-throated Twinspot","Clytospiza ligata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q643)

        val q644 = Birds(644,
            "Vulture Bearded",
            "Bearded Vulture","Gypaetus barbatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q644)

        val q645 = Birds(645,
            "Vulture Cape",
            "Cape Vulture","Gyps coprotheres",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q645)

        val q646= Birds(646,
            "Vulture Hooded",
            "Hooded Vulture","Necrosyrtes monachus",
            R.drawable.vulture_hooded_1j,
            R.drawable.vulture_hooded_2j,
            R.drawable.vulture_hooded_1j,
            R.drawable.vulture_hooded_2j,
            R.drawable.vulture_hooded_1j,
            R.raw.nocall
        )
        birdList.add(q646)

        val q647= Birds(647,
            "Vulture Lappet-faced",
            "Lappet-faced Vulture","Torgos tracheliotos",
            R.drawable.vulture_lappetfaced_1j,
            R.drawable.vulture_lappetfaced_2j,
            R.drawable.vulture_lappetfaced_3j,
            R.drawable.vulture_lappetfaced_2j,
            R.drawable.vulture_lappetfaced_1j,
            R.raw.nocall
        )
        birdList.add(q647)

        val q648 = Birds(648,
            "Vulture Palm-nut",
            "Palm-nut Vulture","Gypohierax angolensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q648)

        val q649 = Birds(649,
            "Vulture White-backed",
            "White-backed Vulture","Gyps africanus",
            R.drawable.vulture_whitebacked_1j,
            R.drawable.vulture_whitebacked_2j,
            R.drawable.vulture_whitebacked_3j,
            R.drawable.vulture_whitebacked_4j,
            R.drawable.vulture_whitebacked_1j,
            R.raw.nocall
        )
        birdList.add(q649)

        val q650 = Birds(650,
            "Vulture White-headed",
            "White-headed Vulture","Trigonoceps occipitalis",
            R.drawable.vulture_whiteheaded_1j,
            R.drawable.vulture_whiteheaded_3j,
            R.drawable.vulture_whiteheaded_3j,
            R.drawable.vulture_whiteheaded_2j,
            R.drawable.vulture_whiteheaded_1j,
            R.raw.nocall
        )
        birdList.add(q650)

        val q651= Birds(651,
            "Wagtail African Pied",
            "African Pied Wagtail","Motacilla aguimp",
            R.drawable.wagtail_pied_1j,
            R.drawable.wagtail_pied_2j,
            R.drawable.wagtail_pied_3j,
            R.drawable.wagtail_pied_4j,
            R.drawable.wagtail_pied_1j,
            R.raw.nocall
        )
        birdList.add(q651)

        val q652 = Birds(652,
            "Wagtail Cape",
            "Cape Wagtail","Motacilla capensis",
            R.drawable.wagtail_cape_1l,
            R.drawable.wagtail_cape_1l,
            R.drawable.wagtail_cape_1l,
            R.drawable.wagtail_cape_1l,
            R.drawable.wagtail_cape_1l,
            R.raw.nocall
        )
        birdList.add(q652)

        val q653 = Birds(653,
            "Wagtail Mountain",
            "Mountain Wagtail","Motacilla clara",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q653)

        val q654 = Birds(654,
            "Wagtail Western Yellow",
            "Western Yellow Wagtail","Motacilla flava",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q654)

        val q655 = Birds(655,
            "Warbler Africa Sedge",
            "Africa Sedge Warbler","Acrocephalus baeticatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q655)

        val q656 = Birds(656,
            "Warbler African Reed",
            "African Reed Warbler","Acrocephalus baeticatus",
            R.drawable.warbler_africanreed_1l,
            R.drawable.warbler_africanreed_1l,
            R.drawable.warbler_africanreed_1l,
            R.drawable.warbler_africanreed_1l,
            R.drawable.warbler_africanreed_1l,
            R.raw.nocall
        )
        birdList.add(q656)

        val q657 = Birds(657,
            "Warbler African Yellow",
            "African Yellow Warbler","Iduna natalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q657)

        val q658= Birds(658,
            "Warbler Barratt's",
            "Barratt's Warbler","Bradypterus barratti",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q658)

        val q659 = Birds(659,
            "Warbler Barred Wren",
            "Barred Wren Warbler","Calamonastes fasciolatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q659)

        val q660 = Birds(660,
            "Warbler Chestnut-vented",
            "Chestnut-vented Warbler","Schoenicola brevirostris",
            R.drawable.titbabbler_chestnutvented_1l,
            R.drawable.titbabbler_chestnutvented_1l,
            R.drawable.titbabbler_chestnutvented_1l,
            R.drawable.titbabbler_chestnutvented_1l,
            R.drawable.titbabbler_chestnutvented_1l,
            R.raw.nocall
        )
        birdList.add(q660)


        val q661 = Birds(661,
            "Warbler Garden",
            "Garden Warbler","Sylvia borin",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q661)

        val q662 = Birds(662,
            "Warbler Great Reed",
            "Great Reed Warbler","Acrocephalus arundinaceus",
            R.drawable.warbler_greatreed_1l,
            R.drawable.warbler_greatreed_1l,
            R.drawable.warbler_greatreed_1l,
            R.drawable.warbler_greatreed_1l,
            R.drawable.warbler_greatreed_1l,
            R.raw.nocall
        )
        birdList.add(q662)

        val q663 = Birds(663,
            "Warbler Icterine",
            "Icterine Warbler","Hippolais icterina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q663)

        val q664 = Birds(664,
            "Warbler Knysna",
            "Knysna Warbler","Bradypterus sylvaticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q664)

        val q665= Birds(665,
            "Warbler Layard's",
            "Layard's Warbler","Bradypterus cinnamomeus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q665)

        val q666 = Birds(666,
            "Warbler Lesser Swamp",
            "Lesser Swamp Warbler","Acrocephalus gracilirostris",
            R.drawable.warbler_lesserswamp_1l,
            R.drawable.warbler_lesserswamp_1l,
            R.drawable.warbler_lesserswamp_1l,
            R.drawable.warbler_lesserswamp_1l,
            R.drawable.warbler_lesserswamp_1l,
            R.raw.nocall
        )
        birdList.add(q666)

        val q667 = Birds(667,
            "Warbler Little Rush",
            "Little Rush Warbler","Bradypterus baboecala",
            R.drawable.warbler_littlerush_1l,
            R.drawable.warbler_littlerush_1l,
            R.drawable.warbler_littlerush_1l,
            R.drawable.warbler_littlerush_1l,
            R.drawable.warbler_littlerush_1l,
            R.raw.nocall
        )
        birdList.add(q667)

        val q668 = Birds(668,
            "Warbler Marsh",
            "Marsh Warbler","Acrocephalus palustris",
            R.drawable.warbler_marsh_1l,
            R.drawable.warbler_marsh_1l,
            R.drawable.warbler_marsh_1l,
            R.drawable.warbler_marsh_1l,
            R.drawable.warbler_marsh_1l,
            R.raw.nocall
        )
        birdList.add(q668)

        val q669 = Birds(669,
            "Warbler Namaqua",
            "Namaqua Warbler","Phragmacia substriata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q669)

        val q670= Birds(670,
            "Warbler Olive-tree",
            "Olive-tree Warbler","Hippolais olivetorum",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q670)

        val q671 = Birds(671,
            "Warbler River",
            "River Warbler","Acrocephalus aquaticus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q671)

        val q672 = Birds(672,
            "Warbler Rufous-eared",
            "Rufous-eared Warbler","Malcorus pectoralis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q672)



        val q673 = Birds(673,
            "Warbler Stierling's Wren",
            "Stierling's Wren Warbler","Calamonastes stierlingi",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q673)

        val q674 = Birds(674,
            "Warbler Victorin's",
            "Victorin's Warbler","Iduna victorini",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q674)

        val q675 = Birds(675,
            "Warbler Willow",
            "Willow Warbler","Phylloscopus trochilus",
            R.drawable.warbler_willow_1l,
            R.drawable.warbler_willow_1l,
            R.drawable.warbler_willow_1l,
            R.drawable.warbler_willow_1l,
            R.drawable.warbler_willow_1l,
            R.raw.nocall
        )
        birdList.add(q675)

        val q676 = Birds(676,
            "Warbler Yellow-throated Woodland",
            "Yellow-throated Woodland Warbler","Phylloscopus rufigularis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q676)

        val q677 = Birds(677,
            "Wattle-eye Black-throated",
            "Black-throated Wattle-eye","Platysteira peltata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q677)

        val q678 = Birds(678,
            "Waxbill Black-faced",
            "Black-faced Waxbill","Estrilda erythronotos",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q678)

        val q679 = Birds(679,
            "Waxbill Blue",
            "Blue Waxbill","Uraeginthus angolensis",
            R.drawable.waxbill_blue_1j,
            R.drawable.waxbill_blue_2j,
            R.drawable.waxbill_blue_3j,
            R.drawable.waxbill_blue_4j,
            R.drawable.waxbill_blue_5j,
            R.raw.nocall
        )
        birdList.add(q679)

        val q680 = Birds(680,
            "Waxbill Common",
            "Common Waxbill","Estrilda astrild",
            R.drawable.waxbill_common_1l,
            R.drawable.waxbill_common_1l,
            R.drawable.waxbill_common_1l,
            R.drawable.waxbill_common_1l,
            R.drawable.waxbill_common_1l,
            R.raw.nocall
        )
        birdList.add(q680)

        val q681 = Birds(681,
            "Waxbill Grey",
            "Grey Waxbill","Neochmia modesta",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q681)

        val q682 = Birds(682,
            "Waxbill Orange-Breasted",
            "Orange-Breasted Waxbill","Neochmia phaeton",
            R.drawable.waxbill_orangebreasted_1l,
            R.drawable.waxbill_orangebreasted_1l,
            R.drawable.waxbill_orangebreasted_1l,
            R.drawable.waxbill_orangebreasted_1l,
            R.drawable.waxbill_orangebreasted_1l,
            R.raw.nocall
        )
        birdList.add(q682)

        val q683 = Birds(683,
            "Waxbill Swee",
            "Swee Waxbill","Padda swee",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q683)

        val q684 = Birds(684,
            "Waxbill Violet-eared",
            "Violet-eared Waxbill","Uraeginthus granatina",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q684)

        val q685 = Birds(685,
            "Weaver Cape",
            "Cape Weaver","Ploceus capensis",
            R.drawable.weaver_cape_1l,
            R.drawable.weaver_cape_2l,
            R.drawable.weaver_cape_1l,
            R.drawable.weaver_cape_2l,
            R.drawable.weaver_cape_1l,
            R.raw.nocall
        )
        birdList.add(q685)

        val q686 = Birds(686,
            "Weaver Dark-backed",
            "Dark-backed Weaver","Ploceus bicolor",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q686)

        val q687 = Birds(687,
            "Weaver Eastern Golden",
            "Eastern Golden Weaver","Ploceus xanthops",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q687)

        val q688 = Birds(688,
            "Weaver Holub's Golden",
            "Holub's Golden Weaver","Ploceus xanthops",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q688)

        val q689 = Birds(689,
            "Weaver Lesser Masked",
            "Lesser Masked Weaver","Ploceus intermedius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q689)

        val q690 = Birds(690,
            "Weaver Red-billed Buffelo",
            "Red-billed Buffelo Weaver","Bubalornis niger",
            R.drawable.weaver_redbilledbuffelo_1j,
            R.drawable.weaver_redbilledbuffelo_2j,
            R.drawable.weaver_redbilledbuffelo_3j,
            R.drawable.weaver_redbilledbuffelo_4j,
            R.drawable.weaver_redbilledbuffelo_1j,
            R.raw.nocall
        )
        birdList.add(q690)

        val q691 = Birds(691,
            "Weaver Red-headed",
            "Red-headed Weaver","Anaplectes rubriceps",
            R.drawable.weaver_redheaded_1j,
            R.drawable.weaver_redheaded_2j,
            R.drawable.weaver_redheaded_1j,
            R.drawable.weaver_redheaded_2j,
            R.drawable.weaver_redheaded_1j,
            R.raw.nocall
        )
        birdList.add(q691)

        val q692 = Birds(692,
            "Weaver Sociable",
            "Sociable Weaver","Philetairus socius",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q692)

        val q693= Birds(693,
            "Weaver Southern Brown-throated",
            "Southern Brown-throated Weaver","Brachycope anomala",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q693)

        val q694 = Birds(964,
            "Weaver Southern Masked",
            "Southern Masked Weaver","Ploceus velatus",
            R.drawable.weaver_southernmasked_1l,
            R.drawable.weaver_southernmasked_2l,
            R.drawable.weaver_southernmasked_1l,
            R.drawable.weaver_southernmasked_2l,
            R.drawable.weaver_southernmasked_1l,
            R.raw.nocall
        )
        birdList.add(q694)

        val q695 = Birds(695,
            "Weaver Spectacled",
            "Spectacled Weaver","Ploceus ocularis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q695)

        val q696= Birds(696,
            "Weaver Thick-billed",
            "Thick-billed Weaver","Amblyospiza albifrons",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q696)

        val q697 = Birds(697,
            "Weaver Village",
            "Village Weaver","Ploceus cucullatus",
            R.drawable.weaver_village_1l,
            R.drawable.weaver_village_2l,
            R.drawable.weaver_village_2l,
            R.drawable.weaver_village_2l,
            R.drawable.weaver_village_1l,
            R.raw.nocall
        )
        birdList.add(q697)

        val q698 = Birds(698,
            "Weaver White-browed Sparrow",
            "White-browed Sparrow Weaver","Plocepasser mahali",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q698)


        val q699 = Birds(699,
            "Wheatear Capped",
            "Capped Wheatear","Oenanthe pileata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q699)

        val q700 = Birds(700,
            "Wheatear Mountain",
            "Mountain Wheatear","Oenanthe monticola",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q700)

        val q701 = Birds(701,
            "Wheatear Pied",
            "Pied Wheatear","Oenanthe pleschanka",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q701)

        val q702 = Birds(702,
            "Whimbrel Common",
            "Common Whimbrel","Numenius phaeopus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q702)


        val q703 = Birds(703,
            "White-eye Cape",
            "Cape White-eye","Zosterops virens",
            R.drawable.whiteeye_cape_1j,
            R.drawable.whiteeye_cape_2l,
            R.drawable.whiteeye_cape_1j,
            R.drawable.whiteeye_cape_2l,
            R.drawable.whiteeye_cape_1j,
            R.raw.nocall
        )
        birdList.add(q703)

        val q704 = Birds(704,
            "White-eye Northen Yellow",
            "Northen Yellow White-eye","Chloropeta natalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q704)

        val q705 = Birds(705,
            "White-eye Orange River",
            "Orange River White-eye","Chloropeta natalensis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q705)

        val q706 = Birds(706,
            "Whitethroat Common",
            "Common Whitethroat","Sylvia communis",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q706)

        val q707= Birds(707,
            "Whydah Long-tailed Paradise",
            "Long-tailed Paradise Whydah","Vidua paradisaea",
            R.drawable.whyda_longtailedparadisewhydah_1j,
            R.drawable.whyda_longtailedparadisewhydah_2j,
            R.drawable.whyda_longtailedparadisewhydah_3j,
            R.drawable.whyda_longtailedparadisewhydah_4j,
            R.drawable.whyda_longtailedparadisewhydah_1j,
            R.raw.nocall
        )
        birdList.add(q707)

        val q708 = Birds(708,
            "Whydah Pin-Tailed",
            "Pin-Tailed Whydah","Vidua macroura",
            R.drawable.whydah_pintailed_1j,
            R.drawable.whydah_pintailed_2l,
            R.drawable.whydah_pintailed_3l,
            R.drawable.whydah_pintailed_2l,
            R.drawable.whydah_pintailed_3l,
            R.raw.nocall
        )
        birdList.add(q708)

        val q709 = Birds(709,
            "Whydah Shaft-tailed",
            "Shaft-tailed Whydah","Vidua regia",
            R.drawable.whydah_shafttailed_1l,
            R.drawable.whydah_shafttailed_1l,
            R.drawable.whydah_shafttailed_1l,
            R.drawable.whydah_shafttailed_1l,
            R.drawable.whydah_shafttailed_1l,
            R.raw.nocall
        )
        birdList.add(q709)

        val q710 = Birds(710,
            "Widowbird Fan-tailed",
            "Fan-tailed Widowbird","Euplectes axillaris",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q710)

        val q711= Birds(711,
            "Widowbird Long-tailed",
            "Long-tailed Widowbird","Euplectes progne",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q711)

        val q712 = Birds(712,
            "Widowbird Red-collared",
            "Red-collared Widowbird","Euplectes ardens",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q712)

        val q713 = Birds(713,
            "Widowbird White-winged",
            "White-winged Widowbird","Euplectes albonotatus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q713)

        val q714 = Birds(714,
            "Wood-hoopoe Green",
            "Green Wood-hoopoe","Phoeniculus purpureus",
            R.drawable.woodhoopoe_green_1j,
            R.drawable.woodhoopoe_green_2j,
            R.drawable.woodhoopoe_green_3j,
            R.drawable.woodhoopoe_green_4j,
            R.drawable.woodhoopoe_green_5j,
            R.raw.nocall
        )
        birdList.add(q714)

        val q715 = Birds(715,
            "Woodpecker Bearded",
            "Bearded Woodpecker","Dendropicos namaquus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q715)

        val q716 = Birds(716,
            "Woodpecker Bennett's",
            "Bennett's Woodpecker","Campethera bennettii",
            R.drawable.woodpecker_bennet_1j,
            R.drawable.woodpecker_bennet_2j,
            R.drawable.woodpecker_bennet_1j,
            R.drawable.woodpecker_bennet_2j,
            R.drawable.woodpecker_bennet_1j,
            R.raw.nocall
        )
        birdList.add(q716)

        val q717 = Birds(717,
            "Woodpecker Cardinal",
            "Cardinal Woodpecker","Dendropicos fuscescens",
            R.drawable.woodpecker_cardinal_1j,
            R.drawable.woodpecker_cardinal_1j,
            R.drawable.woodpecker_cardinal_1j,
            R.drawable.woodpecker_cardinal_1j,
            R.drawable.woodpecker_cardinal_1j,
            R.raw.nocall
        )
        birdList.add(q717)

        val q718 = Birds(718,
            "Woodpecker Golden-tailed",
            "Golden-tailed Woodpecker","Campethera abingoni",
            R.drawable.woodpecker_goldentailed_1l,
            R.drawable.woodpecker_goldentailed_2l,
            R.drawable.woodpecker_goldentailed_1l,
            R.drawable.woodpecker_goldentailed_2l,
            R.drawable.woodpecker_goldentailed_1l,
            R.raw.nocall
        )
        birdList.add(q718)

        val q719 = Birds(719,
            "Woodpecker Ground",
            "Ground Woodpecker","Geocolaptes olivaceus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q719)

        val q720 = Birds(720,
            "Woodpecker Knysna",
            "Knysna Woodpecker","Campethera notata",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q720)

        val q721 = Birds(721,
            "Woodpecker Olive",
            "Olive Woodpecker","Dendropicos griseocephalus",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q721)

        val q722 = Birds(722,
            "Wryneck Red-throated",
            "Red-throated Wryneck","Jynx ruficollis",
            R.drawable.wryneck_redthroated_1l,
            R.drawable.wryneck_redthroated_2l,
            R.drawable.wryneck_redthroated_1l,
            R.drawable.wryneck_redthroated_2l,
            R.drawable.wryneck_redthroated_1l,
            R.raw.nocall
        )
        birdList.add(q722)

        val q723 = Birds(713,
            "Yellowlegs Lesser",
            "Lesser Yellowlegs","Tringa flavipes",
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.drawable.zzz_stillneed,
            R.raw.nocall
        )
        birdList.add(q723)


    return birdList
    }
}











