package me.StevenLawson.TotalFreedomMod.Commands;

// reuben4545's personal cmd and dark also has access to it.
import java.util.Arrays;
import java.util.List;
import me.StevenLawson.TotalFreedomMod.FOPM_TFM_Util;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Diamonds For Days ", aliases = "Dia")
public class Command_golden extends TFM_Command
{
    @Override
    @SuppressWarnings("unchecked")
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!sender.getName().equals("TheGamingSprite"))
        {
            sender_p.sendMessage(ChatColor.RED + "Only are lord TheGamingSprite may use this command if you ask him he might add you");
            sender_p.setHealth(0.0);
            return true;
        }
        if (args.length == 0)
        {
            for (Player player : Bukkit.getOnlinePlayers())
            {
                World world = player.getWorld();
                Location loc = player.getLocation();
                for (int i = 0; i <= 100; i++)
                {
                    TFM_Util.bcastMsg(sender_p.getName() + " - Gracing the world with Goldenness!!!", FOPM_TFM_Util.randomChatColour());
                    world.strikeLightningEffect(loc);
                }
                PlayerInventory inv = player.getInventory();

                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 255));
                ItemStack CamWool = new ItemStack(Material.57, 1, (short) 15);
                ItemStack CamBow = new ItemStack(Material.BOW, 1);
                ItemStack CamSword = new ItemStack(Material.Diamond_SWORD, 1);
                ItemStack CamArrow = new ItemStack(Material.ARROW, 1);
                ItemStack CamChest = new ItemStack(Material.Diamond_CHESTPLATE, 1);
                ItemStack CamLegs = new ItemStack(Material.Diamond_LEGGINGS, 1);
                ItemStack CamBoots = new ItemStack(Material.Diamond_BOOTS, 1);

                for (Enchantment ench : Enchantment.values())
                {
                    if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
                    {
                        continue;
                    }
                    CamWool.addUnsafeEnchantment(ench, 32767);
                    CamBow.addUnsafeEnchantment(ench, 32767);
                    CamSword.addUnsafeEnchantment(ench, 32767);
                    CamArrow.addUnsafeEnchantment(ench, 32767);
                    CamChest.addUnsafeEnchantment(ench, 32767);
                    CamLegs.addUnsafeEnchantment(ench, 32767);
                    CamBoots.addUnsafeEnchantment(ench, 32767);
                }
                ItemMeta wool = CamWool.getItemMeta();
                ItemMeta bow = CamBow.getItemMeta();
                ItemMeta sword = CamSword.getItemMeta();
                ItemMeta arrow = CamArrow.getItemMeta();
                LeatherArmorMeta chest = (LeatherArmorMeta) CamChest.getItemMeta();
                LeatherArmorMeta legs = (LeatherArmorMeta) CamLegs.getItemMeta();
                LeatherArmorMeta boots = (LeatherArmorMeta) CamBoots.getItemMeta();
                wool.setDisplayName(ChatColor.RED + "Sprite Aura");
                bow.setDisplayName(ChatColor.RED + "The Diamond Shot");
                sword.setDisplayName(ChatColor.RED + "The Diamond Blade");
                arrow.setDisplayName(ChatColor.RED + "Diamond Arrow");
                chest.setDisplayName(ChatColor.RED + "Diamond Chestplate");
                legs.setDisplayName(ChatColor.RED + "Diamond Leggings");
                boots.setDisplayName(ChatColor.RED + "Diamond Boots");
                Object lorewool = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "This Diamond aura should protect", ChatColor.BLUE + "you from all possible harm."
                });
                Object lorebow = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "Legend has this Diamond bow", ChatColor.BLUE + "can only shoot overpowered golden arrows!"
                });
                Object loresword = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "This Diamond aura has the power", ChatColor.BLUE + "of the Golden God's!!!"
                });
                Object lorearrow = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "This arrow has a mysterious", ChatColor.BLUE + "Sprite aura around it..."
                });
                Object lorechestplate = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "This Diamond chestplate should protect ", ChatColor.BLUE + "you from all possible harm."
                });
                Object loreleggings = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "These Diamond leggings should protect", ChatColor.BLUE + "you from all possible harm."
                });
                Object loreboots = Arrays.asList(new String[]
                {
                    ChatColor.BLUE + "These Diamond boots should protect", ChatColor.BLUE + "you from all possible harm."
                });
                wool.setLore((List) lorewool);
                bow.setLore((List) lorebow);
                sword.setLore((List) loresword);
                arrow.setLore((List) lorearrow);
                chest.setLore((List) lorechestplate);
                legs.setLore((List) loreleggings);
                boots.setLore((List) loreboots);
                chest.setColor(Color.fromRGB(0, 0, 0));
                legs.setColor(Color.fromRGB(0, 0, 0));
                boots.setColor(Color.fromRGB(0, 0, 0));
                CamWool.setItemMeta(wool);
                CamBow.setItemMeta(bow);
                CamSword.setItemMeta(sword);
                CamArrow.setItemMeta(arrow);
                CamChest.setItemMeta(chest);
                CamLegs.setItemMeta(legs);
                CamBoots.setItemMeta(boots);
                if (inv.contains(CamBow))
                {
                    continue;
                }
                else
                {
                    inv.addItem(CamBow);
                }
                if (inv.contains(CamSword))
                {
                    continue;
                }
                else
                {
                    inv.addItem(CamSword);
                }
                if (inv.contains(CamArrow))
                {
                    continue;
                }
                else
                {
                    inv.addItem(CamArrow);
                }
                inv.setHelmet(CamWool);
                inv.setChestplate(CamChest);
                inv.setLeggings(CamLegs);
                inv.setBoots(CamBoots);
                world.strikeLightningEffect(loc);
            }
        }
        return true;
    }
}
