package cryptor;
import encryptor.EncrypKeyCryptorMethod;
import decryptor.DecrypKeyCryptorMethod;

public interface KeyCryptorCreator {
    EncrypKeyCryptorMethod createEncryptor();
    DecrypKeyCryptorMethod createDecryptor();
}
