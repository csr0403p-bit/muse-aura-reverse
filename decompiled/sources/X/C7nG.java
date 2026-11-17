package X;

import java.io.Serializable;

/* renamed from: X.7nG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7nG implements Comparable<C7nG>, Serializable {
    public static final C7nG A00 = new C7nG(null, null, null, 0, 0, 0);
    public static final long serialVersionUID = 1;
    public final String _artifactId;
    public final String _groupId;
    public final int _majorVersion;
    public final int _minorVersion;
    public final int _patchLevel;
    public final String _snapshotInfo;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C7nG c7nG = (C7nG) obj;
                if (c7nG._majorVersion != this._majorVersion || c7nG._minorVersion != this._minorVersion || c7nG._patchLevel != this._patchLevel || !C6xC.A00(c7nG._snapshotInfo, this._snapshotInfo) || !c7nG._artifactId.equals(this._artifactId) || !c7nG._groupId.equals(this._groupId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(X.C7nG r5) {
        /*
            r4 = this;
            X.7nG r5 = (X.C7nG) r5
            if (r5 == r4) goto L54
            java.lang.String r1 = r4._groupId
            java.lang.String r0 = r5._groupId
            int r1 = r1.compareTo(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = r4._artifactId
            java.lang.String r0 = r5._artifactId
            int r1 = r1.compareTo(r0)
            if (r1 != 0) goto L4d
            int r1 = r4._majorVersion
            int r0 = r5._majorVersion
            int r1 = r1 - r0
            if (r1 != 0) goto L4d
            int r1 = r4._minorVersion
            int r0 = r5._minorVersion
            int r1 = r1 - r0
            if (r1 != 0) goto L4d
            int r1 = r4._patchLevel
            int r0 = r5._patchLevel
            int r1 = r1 - r0
            if (r1 != 0) goto L4d
            java.lang.String r4 = r4._snapshotInfo
            if (r4 == 0) goto L38
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 == 0) goto L39
        L38:
            r3 = 0
        L39:
            java.lang.String r2 = r5._snapshotInfo
            if (r2 == 0) goto L44
            boolean r1 = r2.isEmpty()
            r0 = 1
            if (r1 == 0) goto L45
        L44:
            r0 = 0
        L45:
            if (r3 == 0) goto L50
            if (r0 == 0) goto L4e
            int r1 = r4.compareTo(r2)
        L4d:
            return r1
        L4e:
            r1 = -1
            return r1
        L50:
            if (r0 == 0) goto L54
            r1 = 1
            return r1
        L54:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7nG.compareTo(java.lang.Object):int");
    }

    public final int hashCode() {
        return (this._artifactId.hashCode() ^ this._groupId.hashCode()) ^ (((AnonymousClass006.A0G(this._snapshotInfo) + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public C7nG(String str, String str2, String str3, int i, int i2, int i3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? "" : str2;
        this._artifactId = str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this._majorVersion);
        sbA0w.append('.');
        sbA0w.append(this._minorVersion);
        sbA0w.append('.');
        sbA0w.append(this._patchLevel);
        String str = this._snapshotInfo;
        if (str != null && !str.isEmpty()) {
            sbA0w.append('-');
            sbA0w.append(str);
        }
        return sbA0w.toString();
    }
}
