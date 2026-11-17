package androidx.datastore.preferences.protobuf;

import X.FGI;

/* loaded from: classes6.dex */
public class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(FGI.A0T("Unpaired surrogate at index ", " of ", i, i2));
    }
}
