package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: X.E1h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6332E1h extends SpannableStringBuilder {
    public final Class<?> A00;
    public final List<C6335E1l> A01;

    private C6335E1l A00(Object obj) {
        int i = 0;
        while (true) {
            List<C6335E1l> list = this.A01;
            if (i >= list.size()) {
                return null;
            }
            C6335E1l c6335E1l = list.get(i);
            if (c6335E1l.A00 == obj) {
                return c6335E1l;
            }
            i++;
        }
    }

    private void A01() {
        int i = 0;
        while (true) {
            List<C6335E1l> list = this.A01;
            if (i >= list.size()) {
                return;
            }
            list.get(i).A01.decrementAndGet();
            i++;
        }
    }

    public static void A02(C6332E1h c6332E1h) {
        int i = 0;
        while (true) {
            List<C6335E1l> list = c6332E1h.A01;
            if (i >= list.size()) {
                return;
            }
            list.get(i).A01.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C6335E1l c6335E1lA00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (c6335E1lA00 = A00(obj)) != null) {
                obj = c6335E1lA00;
            }
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C6335E1l c6335E1lA00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (c6335E1lA00 = A00(obj)) != null) {
                obj = c6335E1lA00;
            }
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C6335E1l c6335E1lA00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (c6335E1lA00 = A00(obj)) != null) {
                obj = c6335E1lA00;
            }
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (this.A00 != cls) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C6335E1l[] c6335E1lArr = (C6335E1l[]) super.getSpans(i, i2, C6335E1l.class);
        int length = c6335E1lArr.length;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length));
        for (int i3 = 0; i3 < length; i3++) {
            tArr[i3] = c6335E1lArr[i3].A00;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.A00 == cls) {
            cls = C6335E1l.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeSpan(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            java.lang.Class r1 = r3.getClass()
            java.lang.Class<?> r0 = r2.A00
            if (r0 != r1) goto L1c
            X.E1l r1 = r2.A00(r3)
            if (r1 == 0) goto L11
            r3 = r1
        L11:
            super.removeSpan(r3)
            if (r1 == 0) goto L1b
            java.util.List<X.E1l> r0 = r2.A01
            r0.remove(r1)
        L1b:
            return
        L1c:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6332E1h.removeSpan(java.lang.Object):void");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj != null) {
            if (this.A00 == obj.getClass()) {
                C6335E1l c6335E1l = new C6335E1l(obj);
                this.A01.add(c6335E1l);
                obj = c6335E1l;
            }
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C6332E1h(this, this.A00, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Ljava/lang/CharSequence;)V */
    public C6332E1h(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.A01 = C3cG.A0h();
        this.A00 = cls;
    }

    public final void A03() {
        A01();
        int i = 0;
        while (true) {
            List<C6335E1l> list = this.A01;
            if (i >= list.size()) {
                return;
            }
            list.get(i).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        A02(this);
        super.replace(i, i2, charSequence, i3, i4);
        A01();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable delete(int i, int i2) {
        delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Ljava/lang/CharSequence;II)V */
    public C6332E1h(CharSequence charSequence, Class cls, int i, int i2) {
        super(charSequence, i, i2);
        this.A01 = C3cG.A0h();
        BeS.A03(cls, "watcherClass cannot be null");
        this.A00 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        A02(this);
        super.replace(i, i2, charSequence);
        A01();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }
}
