package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class KeyChord {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Key key;
    public List<? extends KeyModifier> modifiers;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyChord) {
                KeyChord keyChord = (KeyChord) obj;
                if (!C7384Etj.areEqual(this.key, keyChord.key) || !C7384Etj.areEqual(this.modifiers, keyChord.modifiers)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setKey(Key key) {
        C7384Etj.A0Y(key, 0);
        this.key = key;
    }

    public final void setModifiers(List<? extends KeyModifier> list) {
        C7384Etj.A0Y(list, 0);
        this.modifiers = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ KeyChord copy$default(KeyChord keyChord, Key key, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            key = keyChord.key;
        }
        if ((i & 2) != 0) {
            list = keyChord.modifiers;
        }
        AnonymousClass003.A0u(key, list);
        return new KeyChord(key, list);
    }

    public final Key component1() {
        return this.key;
    }

    public final List<KeyModifier> component2() {
        return this.modifiers;
    }

    public final Key getKey() {
        return this.key;
    }

    public final List<KeyModifier> getModifiers() {
        return this.modifiers;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.modifiers, AnonymousClass005.A0E(this.key));
    }

    public String toString() {
        return C3cJ.A0L(this.modifiers, ", modifiers=", C3cG.A0f(this.key, "KeyChord(key="));
    }

    public KeyChord(Key key, List<? extends KeyModifier> list) {
        AnonymousClass003.A0u(key, list);
        this.key = key;
        this.modifiers = list;
    }

    public final KeyChord copy(Key key, List<? extends KeyModifier> list) {
        AnonymousClass003.A0u(key, list);
        return new KeyChord(key, list);
    }
}
