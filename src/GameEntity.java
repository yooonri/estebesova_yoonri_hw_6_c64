public class GameEntity {
    public String name;
    private int characterHp;
    private String attackType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharacterHp() {
        return characterHp;
    }

    public void setCharacterHp(int characterHp) {
        this.characterHp = characterHp;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
