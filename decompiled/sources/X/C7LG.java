package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.7LG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7LG {
    public static G0U<? super Context, ? extends List<? extends ResolveInfo>> A00 = new C8i1(1);
    public static G2k<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super Au3, Unit> A01 = new G2k() { // from class: X.7L4
        @Override // X.G2k
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean zA1X = AnonymousClass001.A1X(obj3);
            long j = ((Au3) obj5).A00;
            String string = ((CharSequence) obj4).subSequence(Au3.A02(j), Au3.A01(j)).toString();
            Intent intentPutExtra = new Intent().setAction(AbstractC7606F5t.A00(2)).setType("text/plain").putExtra(AbstractC7606F5t.A00(33), zA1X);
            ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
            Intent className = intentPutExtra.setClassName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name);
            className.putExtra("android.intent.extra.PROCESS_TEXT", string);
            ((Context) obj).startActivity(className);
            return Unit.INSTANCE;
        }
    };
}
