package xyz.pixelatedw.MineMineNoMi3.entities.mobs.pirates;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.lists.ListMisc;

public class EntityPirateCaptain extends PirateData
{ 
	private String[] textures = {"piratec1", "piratec2", "piratec3"};
	
	public EntityPirateCaptain(World world) 
	{
		super(world);
		this.setTexture(textures[this.rand.nextInt(textures.length)]);
 	} 
	  
	public void applyEntityAttributes()
	{ 
		super.applyEntityAttributes(); 
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	}
	
	protected void addRandomArmor()
	{
		this.setCurrentItemOrArmor(0, new ItemStack(ListMisc.PirateCutlass));
	}
	    
	public double[] itemOffset() 
	{
		return new double[] {0, 0, -0.1};
	}
	
	public int getDorikiPower() { return this.worldObj.rand.nextInt(5) + 1; }
	public int getBellyInPockets() { return this.worldObj.rand.nextInt(15) + 1; }
}
