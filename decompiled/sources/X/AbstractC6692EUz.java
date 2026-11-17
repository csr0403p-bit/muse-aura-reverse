package X;

import java.util.Map;

/* renamed from: X.EUz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6692EUz {
    /* JADX WARN: Incorrect return type in method signature: (LX/EeZ<LX/Edo;>;LX/Eea;)TFETCH_STATE; */
    public abstract EUt createFetchState(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea);

    /* JADX WARN: Incorrect types in method signature: (TFETCH_STATE;LX/EUm;)V */
    public abstract void fetch(EUt eUt, EUm eUm);

    /* JADX WARN: Incorrect types in method signature: (TFETCH_STATE;I)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>; */
    public abstract Map getExtraMap(EUt eUt, int i);

    /* JADX WARN: Incorrect types in method signature: (TFETCH_STATE;I)V */
    public abstract void onFetchCompletion(EUt eUt, int i);

    /* JADX WARN: Incorrect types in method signature: (TFETCH_STATE;)Z */
    public boolean shouldPropagate(EUt eUt) {
        return true;
    }
}
