package X;

import android.content.res.AssetManager;
import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;

/* loaded from: classes5.dex */
public final class DKG {
    public final DKJ A00;
    public final GeneratedHyperThriftClassLookup A01;

    public DKG(AssetManager assetManager) {
        DKH dkh = new DKH(assetManager);
        GeneratedHyperThriftClassLookup generatedHyperThriftClassLookup = new GeneratedHyperThriftClassLookup();
        this.A00 = new DKJ(dkh);
        this.A01 = generatedHyperThriftClassLookup;
    }
}
