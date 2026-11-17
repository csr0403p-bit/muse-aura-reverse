package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CK4 extends BroadcastReceiver {
    public final /* synthetic */ CK5 A00;

    public /* synthetic */ CK4(CK5 ck5) {
        this.A00 = ck5;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CK5 ck5 = this.A00;
        boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
        CJT cjt = ck5.A03;
        if (!zEquals) {
            cjt.A01("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        cjt.A01("List of extras in received intent:", new Object[0]);
        Iterator itA0w = BV5.A0w(intent.getExtras());
        while (itA0w.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA0w);
            cjt.A01("Key: %s; value: %s", strA0j, intent.getExtras().get(strA0j));
        }
        cjt.A01("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        cjt.A01("Key: %s; value: %s", BV5.A1a("install.status", intent.getIntExtra("install.status", 0)));
        cjt.A01("Key: %s; value: %s", BV5.A1a("error.code", intent.getIntExtra("error.code", 0)));
        int intExtra = intent.getIntExtra("install.status", 0);
        long longExtra = intent.getLongExtra("bytes.downloaded", 0L);
        long longExtra2 = intent.getLongExtra("total.bytes.to.download", 0L);
        CK6 ck6 = new CK6(intent.getStringExtra("package.name"), intExtra, intent.getIntExtra("error.code", 0), longExtra, longExtra2);
        cjt.A01("ListenerRegistryBroadcastReceiver.onReceive: %s", ck6);
        synchronized (ck5) {
            Iterator it = BV4.A0x(ck5.A04).iterator();
            while (it.hasNext()) {
                ((CIz) it.next()).onStateUpdate(ck6);
            }
        }
    }
}
