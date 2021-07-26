package com.ray.design;

import com.ray.design.ceiling.LevelOneCeiling;
import com.ray.design.ceiling.LevelTwoCeiling;
import com.ray.design.coat.DuluxCoat;
import com.ray.design.coat.LiBangCoat;
import com.ray.design.floor.DerFloor;
import com.ray.design.floor.ShengXiangFloor;
import com.ray.design.tile.DongPengTile;
import com.ray.design.tile.MarcoPoloTile;

/**
 * @author ray_jone@163.com
 * @date 2021/7/24 18:02
 */
public class Builder {
    public IMenu levelOne(Double aear){
        return new DecorationPackageMenu(aear,"欧洲奢侈")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor())
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelTwo(Double aear){
        return new DecorationPackageMenu(aear,"加拿大风")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new ShengXiangFloor())
                .appendTile(new DongPengTile());
    }

    public IMenu levelThree(Double aear){
        return new DecorationPackageMenu(aear,"田野农装")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new DerFloor())
                .appendTile(new DongPengTile());
    }
}
