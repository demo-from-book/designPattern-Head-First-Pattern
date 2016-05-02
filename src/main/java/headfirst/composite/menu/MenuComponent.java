package headfirst.composite.menu;

import java.util.*;

/**
 * 组合模式。 菜单和菜单项的向上抽象，属于强制抽象，
 * 因为菜单和菜单项有不同的行为，是不同的概念。
 * 部分行为是二者都有的，全部设定为不支持的行为，更好。
 * 
 * @author Ethan.D Chen 下午10:48:19
 */
public abstract class MenuComponent {

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen 下午10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen 下午10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen 下午10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
