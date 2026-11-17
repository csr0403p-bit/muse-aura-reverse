package X;

import android.content.DialogInterface;
import java.util.List;

/* loaded from: classes4.dex */
public final class BE5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ BE4 A00;
    public final /* synthetic */ List<BE6> A01;

    public BE5(BE4 be4, List<BE6> list) {
        this.A00 = be4;
        this.A01 = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        BE4.A00(this.A00, this.A01.get(i).A01);
    }
}
