package X;

import android.app.Activity;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DBL extends AbstractC7559F3s implements G0U<MarkerEditor, Unit> {
    public final /* synthetic */ short $action;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ boolean $isFirstForeground;
    public final /* synthetic */ boolean $isTentativeSurface;
    public final /* synthetic */ int $markerId;
    public final /* synthetic */ CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> $navRecords;
    public final /* synthetic */ int $priorStartType;
    public final /* synthetic */ String $reason;
    public final /* synthetic */ int $startCount;
    public final /* synthetic */ CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> $startRecords;
    public final /* synthetic */ String $startSurface;
    public final /* synthetic */ boolean $wereDexesGenerated;
    public final /* synthetic */ DBJ<ColdInfo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ZLX/DBJ<TColdInfo;>;ILjava/util/concurrent/CopyOnWriteArrayList<LX/DBJ<TColdInfo;>.ActivityRecord;>;Ljava/util/concurrent/CopyOnWriteArrayList<LX/DBJ<TColdInfo;>.NavEventRecord;>;ZZLjava/lang/String;SIILandroid/app/Activity;)V */
    public DBL(Activity activity, DBJ dbj, String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, int i, int i2, int i3, short s, boolean z, boolean z2, boolean z3) {
        super(1);
        this.$startSurface = str;
        this.$isTentativeSurface = z;
        this.this$0 = dbj;
        this.$markerId = i;
        this.$startRecords = copyOnWriteArrayList;
        this.$navRecords = copyOnWriteArrayList2;
        this.$wereDexesGenerated = z2;
        this.$isFirstForeground = z3;
        this.$reason = str2;
        this.$action = s;
        this.$startCount = i2;
        this.$priorStartType = i3;
        this.$activity = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.facebook.quicklog.MarkerEditor r6) {
        /*
            r5 = this;
            com.facebook.quicklog.MarkerEditor r6 = (com.facebook.quicklog.MarkerEditor) r6
            r2 = 0
            X.C7384Etj.A0Y(r6, r2)
            java.lang.String r0 = r5.$startSurface
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "surface"
            r6.annotate(r0, r1)
            java.lang.String r1 = "isTentativeSurface"
            boolean r0 = r5.$isTentativeSurface
            r6.annotate(r1, r0)
            r4 = 1
            X.DBJ<ColdInfo> r0 = r5.this$0
            int r1 = r0.activitiesCreated
            java.lang.String r0 = "activitiesCreated"
            r6.annotate(r0, r1)
            java.util.concurrent.atomic.AtomicReference<X.F2f> r0 = X.C7548F2f.A01
            java.lang.Object r0 = r0.get()
            X.C7384Etj.A0U(r0)
            X.F2f r0 = (X.C7548F2f) r0
            X.Ex0 r0 = r0.A00
            if (r0 != 0) goto L44
            java.lang.String r1 = "firstRunInfo"
            java.lang.String r0 = "Returning default for "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AppState"
            X.CFK.A04(r0, r1)
            X.Ex0 r0 = new X.Ex0
            r0.<init>(r2, r2)
        L44:
            boolean r3 = r0.A00
            boolean r2 = r0.A01
            boolean r0 = r5.$wereDexesGenerated
            if (r0 != 0) goto L50
            if (r3 != 0) goto L50
            if (r2 == 0) goto L55
        L50:
            java.lang.String r0 = "firstRun"
            r6.annotate(r0, r4)
        L55:
            boolean r0 = r5.$wereDexesGenerated
            if (r0 == 0) goto L5e
            java.lang.String r0 = "dexesGenerated"
            r6.annotate(r0, r4)
        L5e:
            java.lang.String r0 = "isNativeMultidex"
            r6.annotate(r0, r4)
            java.lang.String r1 = "firstRunType"
            if (r3 == 0) goto Lad
            java.lang.String r0 = "install"
        L69:
            r6.annotate(r1, r0)
        L6c:
            boolean r0 = r5.$isFirstForeground
            if (r0 == 0) goto L75
            java.lang.String r0 = "firstForeground"
            r6.annotate(r0, r4)
        L75:
            java.lang.String r2 = r5.$reason
            if (r2 == 0) goto L84
            short r1 = r5.$action
            r0 = 2
            if (r1 != r0) goto La1
            java.lang.String r0 = "successReason"
        L81:
            r6.annotate(r0, r2)
        L84:
            java.lang.String r1 = "startCount"
            int r0 = r5.$startCount
            r6.annotate(r1, r0)
            java.lang.String r1 = "priorStartType"
            int r0 = r5.$priorStartType
            r6.annotate(r1, r0)
            X.DBJ<ColdInfo> r3 = r5.this$0
            int r2 = r5.$markerId
            boolean r1 = r5.$isFirstForeground
            android.app.Activity r0 = r5.$activity
            r3.annotateEnd(r2, r6, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La1:
            r0 = 3
            if (r1 != r0) goto La7
            java.lang.String r0 = "failReason"
            goto L81
        La7:
            r0 = 4
            if (r1 != r0) goto L84
            java.lang.String r0 = "cancelReason"
            goto L81
        Lad:
            if (r2 == 0) goto L6c
            java.lang.String r0 = "upgrade"
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBL.invoke(java.lang.Object):java.lang.Object");
    }
}
