package X;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7do implements BNM {
    public Function0<AaC> A00;
    public final InterfaceC2266BNk A01;
    public final View A02;
    public final Function0<AqW> A03;

    public static final boolean A00(Menu menu, final C7do c7do) {
        int i;
        MenuItem menuItemAdd;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        int i2;
        AqW aqWInvoke = c7do.A03.invoke();
        if (C7384Etj.areEqual(aqWInvoke, null)) {
            return false;
        }
        menu.clear();
        List<C7dn> list = aqWInvoke.A00;
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            final C7dn c7dn = list.get(i5);
            if (c7dn instanceof C7dk) {
                i = i3 + 1;
                Object obj = c7dn.A00;
                if (C7384Etj.areEqual(obj, C7dq.A02)) {
                    i2 = R.id.cut;
                } else if (C7384Etj.areEqual(obj, C7dq.A01)) {
                    i2 = R.id.copy;
                } else if (C7384Etj.areEqual(obj, C7dq.A03)) {
                    i2 = R.id.paste;
                } else if (C7384Etj.areEqual(obj, C7dq.A04)) {
                    i2 = R.id.selectAll;
                } else {
                    boolean zAreEqual = C7384Etj.areEqual(obj, C7dq.A00);
                    i2 = i3;
                    if (zAreEqual) {
                        i2 = R.id.autofill;
                    }
                }
                MenuItem menuItemAdd2 = menu.add(i4, i2, i3, ((C7dk) c7dn).A01);
                menuItemAdd2.setShowAsAction(2);
                menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: X.7dp
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ((C7dk) c7dn).A02.invoke(c7do.A01);
                        return true;
                    }
                });
            } else if (c7dn instanceof C7dj) {
                i = i3 + 1;
                final Context context = c7do.A02.getContext();
                C7dj c7dj = (C7dj) c7dn;
                final TextClassification textClassification = c7dj.A01;
                int i6 = c7dj.A00;
                if (i6 < 0) {
                    menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i3, textClassification.getLabel());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setIcon(textClassification.getIcon());
                    onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: X.7di
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            Context context2 = context;
                            TextClassification textClassification2 = textClassification;
                            String text = textClassification2.getText();
                            C7dh.A00(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                            return true;
                        }
                    };
                } else {
                    boolean zA1M = AnonymousClass002.A1M(i6);
                    final RemoteAction remoteAction = textClassification.getActions().get(i6);
                    menuItemAdd = menu.add(R.id.textAssist, zA1M ? R.id.textAssist : 0, i3, remoteAction.getTitle());
                    menuItemAdd.setShowAsAction(zA1M ? 2 : 0);
                    if (zA1M || remoteAction.shouldShowIcon()) {
                        menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
                    }
                    onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: X.7dl
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            C7dh.A00(remoteAction.getActionIntent());
                            return true;
                        }
                    };
                }
                menuItemAdd.setOnMenuItemClickListener(onMenuItemClickListener);
            } else {
                if (c7dn instanceof C7dm) {
                    i4++;
                }
            }
            i3 = i;
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BNk;Lkotlin/jvm/functions/Function0<LX/AqW;>;Lkotlin/jvm/functions/Function0<LX/AaC;>;Landroid/view/View;)V */
    public C7do(View view, InterfaceC2266BNk interfaceC2266BNk, Function0 function0, Function0 function02) {
        this.A01 = interfaceC2266BNk;
        this.A03 = function0;
        this.A00 = function02;
        this.A02 = view;
    }
}
