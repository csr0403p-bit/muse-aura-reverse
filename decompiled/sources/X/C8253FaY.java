package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.FaY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8253FaY extends MenuInflater {
    public static final Class<?>[] A04;
    public static final Class<?>[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    public static Constructor A01(Context context, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        Constructor<?> constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(clsArr);
        constructor.setAccessible(true);
        return constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03da  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(android.util.AttributeSet r46, android.view.Menu r47, org.xmlpull.v1.XmlPullParser r48) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8253FaY.A02(android.util.AttributeSet, android.view.Menu, org.xmlpull.v1.XmlPullParser):void");
    }

    public static void A04(Object obj, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i >= 2) {
            if (obj instanceof C8252FaX) {
                C8252FaX c8252FaX = (C8252FaX) obj;
                c8252FaX.A02 = (c8252FaX.A02 & (-5)) | 4;
                return;
            }
            if (obj instanceof MenuItemC8255Fab) {
                MenuItemC8255Fab menuItemC8255Fab = (MenuItemC8255Fab) obj;
                try {
                    Method declaredMethod = menuItemC8255Fab.A00;
                    if (declaredMethod == null) {
                        declaredMethod = menuItemC8255Fab.A01.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        menuItemC8255Fab.A00 = declaredMethod;
                    }
                    declaredMethod.invoke(menuItemC8255Fab.A01, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    private Object A00(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : A00(((ContextWrapper) obj).getBaseContext());
    }

    public static void A03(MenuItem menuItem, AbstractC8327Fbt abstractC8327Fbt) {
        if (menuItem instanceof InterfaceMenuItemC8267Fap) {
            ((InterfaceMenuItemC8267Fap) menuItem).Aet(abstractC8327Fbt);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC8340FcD)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.A00.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C8249FaR) {
                    C8249FaR c8249FaR = (C8249FaR) menu;
                    if (!c8249FaR.A0D) {
                        c8249FaR.A07();
                        z = true;
                    }
                }
                A02(attributeSetAsAttributeSet, menu, layout);
            } catch (IOException e) {
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (z) {
                ((C8249FaR) menu).A06();
            }
            if (layout != null) {
                layout.close();
            }
        }
    }

    public C8253FaY(Context context) {
        super(context);
        this.A00 = context;
        Object[] objArr = {context};
        this.A03 = objArr;
        this.A02 = objArr;
    }
}
