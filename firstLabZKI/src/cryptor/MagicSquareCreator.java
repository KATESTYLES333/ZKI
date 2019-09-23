package cryptor;

import decryptor.DecrypKeyCryptorMethod;
import decryptor.MagicSquareDecryptor;
import encryptor.EncrypKeyCryptorMethod;
import encryptor.MagicSquareEncryptor;

public class MagicSquareCreator implements KeyCryptorCreator{

    @Override
    public EncrypKeyCryptorMethod createEncryptor() {
        return new MagicSquareEncryptor();
    }

    @Override
    public DecrypKeyCryptorMethod createDecryptor() {
        return new MagicSquareDecryptor();
    }
}
