package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* loaded from: classes5.dex */
public abstract class E8j<K, V> implements E8b<K, V> {
    @Override // X.E8b
    public final long ACB() {
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A04;
        }
        if (this instanceof C6492E8w) {
            return ((C6492E8w) this).A02;
        }
        if (this instanceof C6494E8y) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final int AGA() {
        if (this instanceof E8i) {
            return ((E8i) this).A00;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AHy() {
        if (this instanceof E8i) {
            return ((E8i) this).A01;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AI3() {
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A00;
        }
        if (this instanceof C6492E8w) {
            return ((C6492E8w) this).A00;
        }
        if (this instanceof C6494E8y) {
            return ((C6494E8y) this).A00;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AI4() {
        if (this instanceof E8n) {
            return ((E8n) this).A00;
        }
        if (this instanceof C6491E8v) {
            return ((C6491E8v) this).A00;
        }
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A01;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AIz() {
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A02;
        }
        if (this instanceof C6492E8w) {
            return ((C6492E8w) this).A01;
        }
        if (this instanceof C6494E8y) {
            return ((C6494E8y) this).A01;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AJ0() {
        if (this instanceof E8n) {
            return ((E8n) this).A01;
        }
        if (this instanceof C6491E8v) {
            return ((C6491E8v) this).A01;
        }
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A03;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8d<K, V> AMU() {
        if (this instanceof E8i) {
            return ((E8i) this).A03;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final long AMt() {
        if (this instanceof E8n) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        if (this instanceof C6491E8v) {
            return ((C6491E8v) this).A02;
        }
        if (this instanceof C6488E8s) {
            return ((C6488E8s) this).A05;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final void Ace(long time) {
        if (this instanceof C6488E8s) {
            ((C6488E8s) this).A04 = time;
        } else if (this instanceof C6492E8w) {
            ((C6492E8w) this).A02 = time;
        } else if (!(this instanceof C6494E8y)) {
            throw C8j3.A17();
        }
    }

    @Override // X.E8b
    public final void Adp(E8b<K, V> next) {
        if (this instanceof C6488E8s) {
            ((C6488E8s) this).A00 = next;
        } else if (this instanceof C6492E8w) {
            ((C6492E8w) this).A00 = next;
        } else {
            if (!(this instanceof C6494E8y)) {
                throw C8j3.A17();
            }
            ((C6494E8y) this).A00 = next;
        }
    }

    @Override // X.E8b
    public final void Adq(E8b<K, V> next) {
        if (this instanceof E8n) {
            ((E8n) this).A00 = next;
        } else if (this instanceof C6491E8v) {
            ((C6491E8v) this).A00 = next;
        } else {
            if (!(this instanceof C6488E8s)) {
                throw C8j3.A17();
            }
            ((C6488E8s) this).A01 = next;
        }
    }

    @Override // X.E8b
    public final void AeD(E8b<K, V> previous) {
        if (this instanceof C6488E8s) {
            ((C6488E8s) this).A02 = previous;
        } else if (this instanceof C6492E8w) {
            ((C6492E8w) this).A01 = previous;
        } else {
            if (!(this instanceof C6494E8y)) {
                throw C8j3.A17();
            }
            ((C6494E8y) this).A01 = previous;
        }
    }

    @Override // X.E8b
    public final void AeE(E8b<K, V> previous) {
        if (this instanceof E8n) {
            ((E8n) this).A01 = previous;
        } else if (this instanceof C6491E8v) {
            ((C6491E8v) this).A01 = previous;
        } else {
            if (!(this instanceof C6488E8s)) {
                throw C8j3.A17();
            }
            ((C6488E8s) this).A03 = previous;
        }
    }

    @Override // X.E8b
    public final void AfA(E8d<K, V> valueReference) {
        if (!(this instanceof E8i)) {
            throw C8j3.A17();
        }
        ((E8i) this).A03 = valueReference;
    }

    @Override // X.E8b
    public final void AfH(long time) {
        if (this instanceof E8n) {
            return;
        }
        if (this instanceof C6491E8v) {
            ((C6491E8v) this).A02 = time;
        } else {
            if (!(this instanceof C6488E8s)) {
                throw C8j3.A17();
            }
            ((C6488E8s) this).A05 = time;
        }
    }

    @Override // X.E8b
    public final K getKey() {
        if (this instanceof E8i) {
            return ((E8i) this).A02;
        }
        throw C8j3.A17();
    }
}
