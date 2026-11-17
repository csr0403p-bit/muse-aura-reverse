package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* loaded from: classes5.dex */
public final class DH0 implements DGT {
    @Override // X.DGT
    public final C4934DFk shouldLog(String str, C4949DGw c4949DGw) {
        int i;
        boolean zA1b = AnonymousClass004.A1b(str, c4949DGw);
        FFSingletonJNILogger.CollectionControlDecision collectionControlDecisionCollectionControlCheck = FFSingletonJNILogger.collectionControlCheck(c4949DGw.A00, str, 1L, System.currentTimeMillis(), zA1b, zA1b, "", "");
        boolean z = false;
        FFSingletonJNILogger.CollectionControlDecisionStatus collectionControlDecisionStatus = collectionControlDecisionCollectionControlCheck.status;
        FFSingletonJNILogger.CollectionControlDecisionStatus collectionControlDecisionStatus2 = FFSingletonJNILogger.CollectionControlDecisionStatus.SUCCESS;
        if (collectionControlDecisionStatus == collectionControlDecisionStatus2) {
            i = (int) collectionControlDecisionCollectionControlCheck.sampleRate;
            CIA cia = c4949DGw.A01;
            if (cia != null && cia.A01 != null) {
                z = true;
                z = true;
            }
        } else {
            z = collectionControlDecisionStatus == FFSingletonJNILogger.CollectionControlDecisionStatus.EVENT_CONFIG_NOT_SET;
            i = 1;
        }
        return new C4934DFk(i, collectionControlDecisionCollectionControlCheck.collectionControlChecksum, z, z, collectionControlDecisionStatus != collectionControlDecisionStatus2);
    }
}
