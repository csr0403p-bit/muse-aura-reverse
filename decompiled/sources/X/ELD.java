package X;

import X.ELD;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes5.dex */
public abstract class ELD<T> extends EL8<T> {
    public final BroadcastReceiver A00;

    public final IntentFilter A00() {
        IntentFilter intentFilter;
        String str;
        if (this instanceof ELB) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
            str = "android.intent.action.DEVICE_STORAGE_LOW";
        } else if (this instanceof EL9) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            str = "android.intent.action.BATTERY_LOW";
        } else {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public ELD(Context context, ENP enp) {
        super(context, enp);
        this.A00 = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            public final /* synthetic */ ELD<T> A00;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceive(android.content.Context r6, android.content.Intent r7) {
                /*
                    r5 = this;
                    r6 = 1
                    X.C7384Etj.A0Y(r7, r6)
                    X.ELD<T> r4 = r5.A00
                    boolean r0 = r4 instanceof X.ELB
                    if (r0 == 0) goto L45
                    r5 = 0
                    java.lang.String r0 = r7.getAction()
                    if (r0 == 0) goto Ld7
                    X.EK9 r3 = X.EK9.A00()
                    java.lang.String r2 = X.AbstractC6656EMo.A00
                    java.lang.String r1 = r7.getAction()
                    java.lang.String r0 = "Received "
                    X.BV4.A1E(r3, r0, r1, r2)
                    java.lang.String r3 = r7.getAction()
                    if (r3 == 0) goto Ld7
                    int r1 = r3.hashCode()
                    r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
                    if (r1 == r0) goto La8
                    r0 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
                    if (r1 != r0) goto Ld7
                    java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
                L36:
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto Ld7
                    r5 = 1
                L3d:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
                L41:
                    java.lang.Object r3 = r4.A03
                    monitor-enter(r3)
                    goto Lb1
                L45:
                    boolean r0 = r4 instanceof X.EL9
                    r5 = 0
                    if (r0 == 0) goto L79
                    java.lang.String r0 = r7.getAction()
                    if (r0 == 0) goto Ld7
                    X.EK9 r3 = X.EK9.A00()
                    java.lang.String r2 = X.AbstractC6653EMl.A00
                    java.lang.String r1 = r7.getAction()
                    java.lang.String r0 = "Received "
                    X.BV4.A1E(r3, r0, r1, r2)
                    java.lang.String r3 = r7.getAction()
                    if (r3 == 0) goto Ld7
                    int r1 = r3.hashCode()
                    r0 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
                    if (r1 == r0) goto L76
                    r0 = 490310653(0x1d398bfd, float:2.4556918E-21)
                    if (r1 != r0) goto Ld7
                    java.lang.String r0 = "android.intent.action.BATTERY_LOW"
                    goto Laa
                L76:
                    java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
                    goto L36
                L79:
                    java.lang.String r3 = r7.getAction()
                    if (r3 == 0) goto Ld7
                    X.EK9 r2 = X.EK9.A00()
                    java.lang.String r1 = X.AbstractC6652EMk.A00
                    java.lang.String r0 = "Received "
                    X.BV4.A1E(r2, r0, r3, r1)
                    int r0 = r3.hashCode()
                    switch(r0) {
                        case -1886648615: goto La2;
                        case -54942926: goto La5;
                        case 948344062: goto L92;
                        case 1019184907: goto L95;
                        default: goto L91;
                    }
                L91:
                    return
                L92:
                    java.lang.String r0 = "android.os.action.CHARGING"
                    goto L97
                L95:
                    java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
                L97:
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto Ld7
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
                    goto L41
                La2:
                    java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
                    goto Laa
                La5:
                    java.lang.String r0 = "android.os.action.DISCHARGING"
                    goto Laa
                La8:
                    java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
                Laa:
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L3d
                    return
                Lb1:
                    T r0 = r4.A00     // Catch: java.lang.Throwable -> Ld4
                    if (r0 == 0) goto Lbc
                    boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld4
                    if (r0 == 0) goto Lbc
                    goto Ld2
                Lbc:
                    r4.A00 = r1     // Catch: java.lang.Throwable -> Ld4
                    java.util.LinkedHashSet<X.EMs<T>> r0 = r4.A04     // Catch: java.lang.Throwable -> Ld4
                    java.util.List r2 = X.AbstractC0878AGe.A0X(r0)     // Catch: java.lang.Throwable -> Ld4
                    X.ENP r0 = r4.A02     // Catch: java.lang.Throwable -> Ld4
                    X.EKj r0 = (X.C6616EKj) r0     // Catch: java.lang.Throwable -> Ld4
                    java.util.concurrent.Executor r1 = r0.A02     // Catch: java.lang.Throwable -> Ld4
                    X.ELQ r0 = new X.ELQ     // Catch: java.lang.Throwable -> Ld4
                    r0.<init>()     // Catch: java.lang.Throwable -> Ld4
                    r1.execute(r0)     // Catch: java.lang.Throwable -> Ld4
                Ld2:
                    monitor-exit(r3)
                    return
                Ld4:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                Ld7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1.onReceive(android.content.Context, android.content.Intent):void");
            }

            {
                this.A00 = this;
            }
        };
    }
}
