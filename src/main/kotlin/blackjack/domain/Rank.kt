package blackjack.domain

enum class Rank(val outputName: String, val score: Int) {
    ACE("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    J("J", 10),
    Q("Q", 10),
    K("K", 10);

    companion object {
        private val RANK_SET = values().associateBy { it.outputName }

        fun getRankSet(): Map<String, Rank> {
            return RANK_SET
        }
    }
}
