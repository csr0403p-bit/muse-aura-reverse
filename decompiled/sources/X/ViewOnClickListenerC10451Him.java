package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Him, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC10451Him implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            Context context = view2.getContext();
            for (Context baseContext = context; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                try {
                    if (!baseContext.isRestricted() && (method = baseContext.getClass().getMethod(this.A03, View.class)) != null) {
                        this.A01 = method;
                        this.A00 = baseContext;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            String strA0U = id == -1 ? "" : FGI.A0U(" with id '", context.getResources().getResourceEntryName(id), "'");
            StringBuilder sbA0x = C60O.A0x("Could not find method ");
            sbA0x.append(this.A03);
            sbA0x.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sbA0x.append(view2.getClass());
            throw BV8.A0m(strA0U, sbA0x);
        }
        try {
            method.invoke(this.A00, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }

    public ViewOnClickListenerC10451Him(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }
}
