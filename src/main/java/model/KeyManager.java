package model;

import java.util.Random;

public class KeyManager
{
    private Key key;

    public KeyManager()
    {

    }

    public void addKey()
    {
        Random random = new Random();

        key = new Key(random.nextInt(3) + 1);
    }

    public int getKeyValue()
    {
        return key.getvalue();
    }

    public Key getKey()
    {
        return key;
    }
}
