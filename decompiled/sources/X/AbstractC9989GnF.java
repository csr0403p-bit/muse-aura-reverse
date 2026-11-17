package X;

/* renamed from: X.GnF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9989GnF {
    public static final C9900Gkg A00;
    public static final C10032Go8 A01;
    public static final C9799GhH A02;
    public static final C10032Go8 A03;

    static {
        C9799GhH c9799GhH = new C9799GhH();
        A02 = c9799GhH;
        C9963Gma c9963Gma = c9799GhH._serializationConfig;
        A01 = new C10032Go8(c9799GhH, c9963Gma);
        C10032Go8 c10032Go8 = new C10032Go8(c9799GhH, c9963Gma);
        C9963Gma c9963Gma2 = c10032Go8._config;
        InterfaceC10049GoT interfaceC10049GoT = c9963Gma2._defaultPrettyPrinter;
        C10116Gph c10116Gph = c10032Go8._generatorSettings;
        if (interfaceC10049GoT == null) {
            interfaceC10049GoT = C10032Go8.A00;
        }
        C10116Gph c10116Gph2 = interfaceC10049GoT == c10116Gph.prettyPrinter ? c10116Gph : new C10116Gph(interfaceC10049GoT, c10116Gph.rootValueSeparator);
        C9847Giq c9847Giq = c10032Go8._prefetch;
        if (c10116Gph != c10116Gph2) {
            c10032Go8 = new C10032Go8(c10116Gph2, c9847Giq, c10032Go8, c9963Gma2);
        }
        A03 = c10032Go8;
        A00 = new C9900Gkg(c9799GhH._deserializationConfig, c9799GhH._typeFactory.A09(AbstractC9804GhQ.class), c9799GhH);
    }
}
