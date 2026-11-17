package X;

/* loaded from: classes4.dex */
public abstract class A5p {
    public static final String A00(String str, InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0h("Cannot deserialize ", str, " with '", C60O.A0n(interfaceC07829iw), "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.");
    }

    public static final String A01(String str, InterfaceC07789is interfaceC07789is) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0h("Cannot serialize ", str, " with '", C60O.A0n(interfaceC07789is), "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.");
    }
}
