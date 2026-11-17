package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.792, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass792 extends Hx6<Set<? extends String>, Set<? extends String>> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        boolean zA1a = AnonymousClass002.A1a(context, set2);
        String[] strArr = (String[]) set2.toArray(new String[0]);
        C7384Etj.A0Y(strArr, zA1a ? 1 : 0);
        Intent intentPutExtra = C60P.A03("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ AnonymousClass795<Set<? extends String>> getSynchronousResult(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        AnonymousClass795<Map<String, Boolean>> anonymousClass795A00 = AnonymousClass793.A00(context, (String[]) set2.toArray(new String[AnonymousClass004.A1b(context, set2)]));
        if (anonymousClass795A00 == null) {
            return null;
        }
        Map<String, Boolean> map = anonymousClass795A00.A00;
        C7384Etj.A0U(map);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Boolean bool = (Boolean) entryA0l.getValue();
            C7384Etj.A0X(bool);
            if (bool.booleanValue()) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return new AnonymousClass795<>(linkedHashMapA0j.keySet());
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Set<? extends String> parseResult(int i, Intent intent) {
        Map mapA01 = AnonymousClass793.A01(intent, i);
        C7384Etj.A0U(mapA01);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(mapA01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Boolean bool = (Boolean) entryA0l.getValue();
            C7384Etj.A0X(bool);
            if (bool.booleanValue()) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return linkedHashMapA0j.keySet();
    }
}
