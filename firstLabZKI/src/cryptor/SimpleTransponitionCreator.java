package cryptor;

import decryptor.DecrypKeyCryptorMethod;
import decryptor.SimpleTransponitionDecryptor;
import encryptor.EncrypKeyCryptorMethod;
import encryptor.SimpleTransponitionEncryptor;

public class SimpleTransponitionCreator implements KeyCryptorCreator {
    @Override
    public EncrypKeyCryptorMethod createEncryptor() {
        return new SimpleTransponitionEncryptor();
    }

    @Override
    public DecrypKeyCryptorMethod createDecryptor() {
        return new SimpleTransponitionDecryptor();
    }
}
