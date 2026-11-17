package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FLH implements FS1 {
    public final /* synthetic */ WeakReference<FL4> A00;

    public FLH(WeakReference<FL4> weakReference) {
        this.A00 = weakReference;
    }

    @Override // X.FS1
    public final C8071FRz AVC(View view, C8071FRz c8071FRz) {
        Pair pairCreate;
        Pair pairCreate2;
        FL4 fl4;
        FLW flw;
        ClipData clipDataADj = c8071FRz.A00.ADj();
        C8071FRz c8071FRz2 = null;
        if (clipDataADj.getItemCount() == 1) {
            C8071FRz c8071FRz3 = c8071FRz;
            if (clipDataADj.getItemAt(0).getUri() == null) {
                c8071FRz3 = null;
                c8071FRz2 = c8071FRz;
            }
            pairCreate2 = Pair.create(c8071FRz3, c8071FRz2);
        } else {
            ArrayList arrayListA0x = null;
            ArrayList arrayListA0x2 = null;
            for (int i = 0; i < clipDataADj.getItemCount(); i++) {
                ClipData.Item itemAt = clipDataADj.getItemAt(i);
                if (itemAt.getUri() != null) {
                    arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                    arrayListA0x.add(itemAt);
                } else {
                    arrayListA0x2 = AbstractC7609F5w.A0x(arrayListA0x2);
                    arrayListA0x2.add(itemAt);
                }
            }
            if (arrayListA0x == null) {
                pairCreate = Pair.create(null, clipDataADj);
            } else if (arrayListA0x2 == null) {
                pairCreate = Pair.create(clipDataADj, null);
            } else {
                ClipData clipData = new ClipData(new ClipDescription(clipDataADj.getDescription()), (ClipData.Item) arrayListA0x.get(0));
                for (int i2 = 1; i2 < arrayListA0x.size(); i2++) {
                    clipData.addItem((ClipData.Item) arrayListA0x.get(i2));
                }
                ClipData clipData2 = new ClipData(new ClipDescription(clipDataADj.getDescription()), (ClipData.Item) arrayListA0x2.get(0));
                for (int i3 = 1; i3 < arrayListA0x2.size(); i3++) {
                    clipData2.addItem((ClipData.Item) arrayListA0x2.get(i3));
                }
                pairCreate = Pair.create(clipData, clipData2);
            }
            if (pairCreate.first == null) {
                pairCreate2 = Pair.create(null, c8071FRz);
            } else if (pairCreate.second == null) {
                pairCreate2 = Pair.create(c8071FRz, null);
            } else {
                C8066FRu c8066FRu = new C8066FRu(c8071FRz);
                ClipData clipData3 = (ClipData) pairCreate.first;
                Hqo hqo = c8066FRu.A00;
                hqo.Ad1(clipData3);
                C8071FRz c8071FRzA5P = hqo.A5P();
                C8066FRu c8066FRu2 = new C8066FRu(c8071FRz);
                ClipData clipData4 = (ClipData) pairCreate.second;
                Hqo hqo2 = c8066FRu2.A00;
                hqo2.Ad1(clipData4);
                pairCreate2 = Pair.create(c8071FRzA5P, hqo2.A5P());
            }
        }
        C7384Etj.A0U(pairCreate2);
        C8071FRz c8071FRz4 = (C8071FRz) pairCreate2.first;
        C8071FRz c8071FRz5 = (C8071FRz) pairCreate2.second;
        if (c8071FRz4 != null) {
            WeakReference<FL4> weakReference = this.A00;
            ClipData clipDataADj2 = c8071FRz4.A00.ADj();
            C7384Etj.A0U(clipDataADj2);
            int itemCount = clipDataADj2.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                Uri uri = clipDataADj2.getItemAt(i4).getUri();
                if (uri != null && (fl4 = weakReference.get()) != null && (flw = fl4.A00) != null) {
                    FLG flg = (FLG) flw;
                    AbstractC8162FXe.A01(new HmZ(flg.A00, flg.A01, flg.A02, uri.toString()));
                }
            }
        }
        return c8071FRz5;
    }
}
