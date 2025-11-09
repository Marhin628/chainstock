package prompts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Prompt class and repository of fictional campus news prompts.
 *
 * NOTE: All prompts are purely fictional and generated for simulation/training purposes.
 * They reference buildings and meal locations commonly associated with UB North Campus
 * but do not reflect real events.
 */
public class Prompt {
    private final int day;   // 1..7
    private final int index; // 1..20 within the day
    private final String text;

    public Prompt(int day, int index, String text) {
        this.day = day;
        this.index = index;
        this.text = text;
    }

    public int getDay() {
        return day;
    }

    public int getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Day " + day + " #" + index + ": " + text;
    }

    // --- Repository of prompts: 7 days × 20 prompts each (fictional) ---
    private static final Map<Integer, List<Prompt>> PROMPTS_BY_DAY = new HashMap<>();

    static {
        // Day 1
        List<Prompt> d1 = new ArrayList<>();
        d1.add(new Prompt(1, 1, "Student protest outside Capen Hall demands extended Commons dining hours after a midnight study spike."));
        d1.add(new Prompt(1, 2, "A viral TikTok shows students lining up for the new 'Baldy Bagel' pop-up near Baldy Hall, causing long queues."));
        d1.add(new Prompt(1, 3, "Rumors of a surprise performance on the North Campus Green draw social attention to outdoor spaces and nearby food trucks.") );
        d1.add(new Prompt(1, 4, "Ellicott Complex announces a themed brunch at The Commons, leading to increased conversations on campus forums."));
        d1.add(new Prompt(1, 5, "Late-night study photos at the Engineering labs (near Kapischke) go viral, boosting mentions of lab resources and equipment rentals."));
        d1.add(new Prompt(1, 6, "New mural on the side of Grosvenor Hall becomes a weekend selfie hotspot, driving foot-traffic chatter."));
        d1.add(new Prompt(1, 7, "A student-run pop-up coffee stand outside the Student Union offers discount coupons, sparking campus-wide coupon swapping."));
        d1.add(new Prompt(1, 8, "Campus wellness event at the Center for the Arts features free smoothies from Commons, increasing positive mentions of dining options."));
        d1.add(new Prompt(1, 9, "An Instagram reel shows a mysterious flyer on Park Hall announcing a scavenger hunt with free meal vouchers — shares spike."));
        d1.add(new Prompt(1, 10, "Maintenance closure at a popular study lounge in Lockwood Library (fictionalized as North Study Commons) triggers student threads about alternative spots."));
        d1.add(new Prompt(1, 11, "A food review blog posts a glowing piece about the new ramen pop-up near the Student Union, prompting long waits."));
        d1.add(new Prompt(1, 12, "Campus transit strike rumor causes students to post tips for carpooling to off-campus dining, trending locally."));
        d1.add(new Prompt(1, 13, "Volunteer cleanup at the pond outside Capen Hall is livestreamed, drawing goodwill mentions across platforms."));
        d1.add(new Prompt(1, 14, "A meme about 'midterm fuel' at the Commons Dining Hall circulates, increasing late-night dining mentions."));
        d1.add(new Prompt(1, 15, "Alumni reunion photo series tags Park Hall and the old quad, driving nostalgia-driven shares."));
        d1.add(new Prompt(1, 16, "Student art exhibit in the Fine Arts building features edible art samples, generating foodie buzz."));
        d1.add(new Prompt(1, 17, "A popular campus influencer posts a day-in-the-life featuring breakfast at The Commons and study hours in Baldy."));
        d1.add(new Prompt(1, 18, "Campus safety alert (fictional) about a temporary closure near the north parking lot causes increased mentions of alternative entrances."));
        d1.add(new Prompt(1, 19, "New bike-share station installed by Capen Hall is praised on local community boards, trending for convenience."));
        d1.add(new Prompt(1, 20, "A quirky campus challenge to find the 'best burrito near Baldy' spreads across student message boards."));
        PROMPTS_BY_DAY.put(1, Collections.unmodifiableList(d1));

        // Day 2
        List<Prompt> d2 = new ArrayList<>();
        d2.add(new Prompt(2, 1, "A mock mayoral debate held in the Student Union is recorded and shared widely, spotlighting campus civic life."));
        d2.add(new Prompt(2, 2, "Photos of a late-night study jam at Capen Hall's steps spark a hashtag about all-night study spots."));
        d2.add(new Prompt(2, 3, "The Commons unveils a limited-time 'Buffalo Brunch' menu; students rave and tag friends in posts."));
        d2.add(new Prompt(2, 4, "Pop-up farmers market in front of Grosvenor Hall draws families and influencers from nearby neighborhoods."));
        d2.add(new Prompt(2, 5, "An experimental sculpture outside the Fine Arts building becomes a trending prank backdrop for short videos."));
        d2.add(new Prompt(2, 6, "Student theater troupe stages a flash performance in the Quad, creating short viral clips."));
        d2.add(new Prompt(2, 7, "A wellness workshop at the Student Union offers free donated smoothies, prompting shares about campus health perks."));
        d2.add(new Prompt(2, 8, "A rumor about a celebrity sighting near the North Campus bookstore spreads rapidly (fictional)."));
        d2.add(new Prompt(2, 9, "An advice thread about the best study tables in Capen Hall goes viral among freshmen communities."));
        d2.add(new Prompt(2, 10, "Local food blogger posts a list of 'Top 5 late-night eats near North Campus', mentioning The Commons and a corner deli."));
        d2.add(new Prompt(2, 11, "Student hackathon teams camp out overnight in the engineering building, live-tweeting progress and snacks."));
        d2.add(new Prompt(2, 12, "Campus police hosts a friendly safety demonstration near the main lawn that gets shared as a community event."));
        d2.add(new Prompt(2, 13, "A spontaneous volleyball game on the lawn outside Park Hall is recorded and gains cheerful attention."));
        d2.add(new Prompt(2, 14, "An alumni chef hosts a popup at The Commons kitchen, bringing positive press and foodie tags."));
        d2.add(new Prompt(2, 15, "Power outage in one dorm causes students to joke about candlelit study nights — memes spread."));
        d2.add(new Prompt(2, 16, "New sustainable cups at campus cafes (Student Union) spark praise for green initiatives."));
        d2.add(new Prompt(2, 17, "A rumor about free merch at the student activities fair sends students rushing to the Quad."));
        d2.add(new Prompt(2, 18, "A trending study playlist recorded in a classroom near Baldy Hall is shared with thousands of followers."));
        d2.add(new Prompt(2, 19, "Students organize a charity bake sale at the Student Union entrance, attracting local press."));
        d2.add(new Prompt(2, 20, "An experimental late-night library cafe trial is announced, boosting chatter about study conveniences."));
        PROMPTS_BY_DAY.put(2, Collections.unmodifiableList(d2));

        // Day 3
        List<Prompt> d3 = new ArrayList<>();
        d3.add(new Prompt(3, 1, "A short documentary filmed on North Campus highlights hidden study nooks, sparking search traffic to map pins."));
        d3.add(new Prompt(3, 2, "Baldy Hall hosts an all-you-can-eat student challenge; participants post reaction videos that trend."));
        d3.add(new Prompt(3, 3, "A campus sustainability initiative places beehives near the main quad and students post picturesque photos."));
        d3.add(new Prompt(3, 4, "The Student Union opens a temporary outdoor cinema; clips of the crowd go viral."));
        d3.add(new Prompt(3, 5, "A popular study cohort posts a 'study with me' stream filmed in Capen Hall; donations and mentions rise."));
        d3.add(new Prompt(3, 6, "Campus dining announces a 'Taste of the World' week at The Commons, shared across social feeds."));
        d3.add(new Prompt(3, 7, "An urban gardening club transforms a small corner by Grosvenor into a photo-ready space, shared by local influencers."));
        d3.add(new Prompt(3, 8, "An impromptu dance-off at the Student Union escalates into a short viral trend among students."));
        d3.add(new Prompt(3, 9, "An overnight coding session produces a quirky app that maps best burrito spots near North Campus; students celebrate."));
        d3.add(new Prompt(3, 10, "A playful petition to rename a campus bench after a beloved professor circulates and gets traction."));
        d3.add(new Prompt(3, 11, "A film screening in the Fine Arts building features alumni work and sparks nostalgia-driven posts."));
        d3.add(new Prompt(3, 12, "Campus gardening fair with free samples from Commons attracts family weekend attention."));
        d3.add(new Prompt(3, 13, "Students set up a temporary photo booth outside Park Hall offering free prints, creating buzz."));
        d3.add(new Prompt(3, 14, "An accidental viral clip shows a raccoon pilfering snacks outside The Commons, leading to humorous threads."));
        d3.add(new Prompt(3, 15, "A new study mentorship program launches with kickoff in Capen, widely shared by student groups."));
        d3.add(new Prompt(3, 16, "A trending debate over the best late-night coffee spot near North Campus divides student followers."));
        d3.add(new Prompt(3, 17, "Student filmmakers screen short films in the Student Union; clips are reposted by local arts accounts."));
        d3.add(new Prompt(3, 18, "A flash sale at the campus bookstore (near Baldy) for vintage merch causes a sudden spike in check-ins."));
        d3.add(new Prompt(3, 19, "A campus wellness challenge encourages posting sunrise photos near the North Campus pond—many participate."));
        d3.add(new Prompt(3, 20, "A campus improv troupe's sketch about cafeteria life becomes a widely-shared inside joke among students."));
        PROMPTS_BY_DAY.put(3, Collections.unmodifiableList(d3));

        // Day 4
        List<Prompt> d4 = new ArrayList<>();
        d4.add(new Prompt(4, 1, "A student startup demo day in the engineering building attracts local entrepreneurs who tweet highlights."));
        d4.add(new Prompt(4, 2, "Campus security hosts a bike-safety pop-up at the main entrance, prompting tips and shares."));
        d4.add(new Prompt(4, 3, "A 'mystery smoothie' challenge at The Commons becomes a weekend craze with students posting reactions."));
        d4.add(new Prompt(4, 4, "An alumni athletics highlight reel tags North Campus training facilities, stirring pride and shares."));
        d4.add(new Prompt(4, 5, "The Fine Arts building courtyard features an impromptu craft market that students widely photograph."));
        d4.add(new Prompt(4, 6, "A campus podcast records a live episode in the Student Union and fans repost soundbites."));
        d4.add(new Prompt(4, 7, "A viral listicle names the top 10 study spots on North Campus, sending traffic to mapped locations."));
        d4.add(new Prompt(4, 8, "A student-run food truck campus tour stops by Baldy Hall, shared by food bloggers."));
        d4.add(new Prompt(4, 9, "An outdoor yoga session by the pond draws a crowd and is featured in a trending student wellness reel."));
        d4.add(new Prompt(4, 10, "Noise complaints about late-night events spark debate threads about campus life balance."));
        d4.add(new Prompt(4, 11, "The university hosts a mini science fair in the quad; quirky demos are clipped and shared."));
        d4.add(new Prompt(4, 12, "Students create a scavenger hunt app for historic plaques around North Campus that quickly spreads."));
        d4.add(new Prompt(4, 13, "An influencer posts a guide to 'Best Budget Eats near North Campus' featuring Commons hacks."));
        d4.add(new Prompt(4, 14, "A photo essay about campus architecture centered on Capen Hall circulates in student art circles."));
        d4.add(new Prompt(4, 15, "A late-night improv jam outside the Student Union is shared in short-form videos, boosting social mentions."));
        d4.add(new Prompt(4, 16, "A sudden fame for a quirky bench sculpture near Grosvenor leads to pop-up meetups."));
        d4.add(new Prompt(4, 17, "Campus sustainability week launches with a composting station demo by The Commons kitchen."));
        d4.add(new Prompt(4, 18, "A fake UFO sighting prank (harmless) near Park Hall spirals into humorous social posts."));
        d4.add(new Prompt(4, 19, "Students organize a midnight breakfast crawl across 3 campus dining halls, documenting each stop."));
        d4.add(new Prompt(4, 20, "A flash art installation in the Fine Arts plaza invites students to post 'before and after' edits."));
        PROMPTS_BY_DAY.put(4, Collections.unmodifiableList(d4));

        // Day 5
        List<Prompt> d5 = new ArrayList<>();
        d5.add(new Prompt(5, 1, "A community volunteer day at the North Campus garden is livestreamed and praised widely."));
        d5.add(new Prompt(5, 2, "An unauthorized (fictional) mascot appearance at the Student Union fuels playful speculation on forums."));
        d5.add(new Prompt(5, 3, "A surprising acoustic set by a student band outside Baldy Hall is captured and shared broadly."));
        d5.add(new Prompt(5, 4, "New study-nook lighting in the engineering library is photographed and students applaud the upgrade."));
        d5.add(new Prompt(5, 5, "Students launch a themed food week at The Commons highlighting nostalgic campus dishes; posts spike."));
        d5.add(new Prompt(5, 6, "A campus-run thrift fair near Park Hall showcases curated vintage gear, creating a fashion buzz."));
        d5.add(new Prompt(5, 7, "An ethics debate in Capen Hall goes viral after a clip of a passionate exchange is reposted."));
        d5.add(new Prompt(5, 8, "A student-run late-night study hotline is announced from the Student Union, gaining supportive shares."));
        d5.add(new Prompt(5, 9, "A mini farmers market pop-up near Grosvenor features student-made pastries that trend on local feeds."));
        d5.add(new Prompt(5, 10, "A creative campus photo contest with a Commons meal as a prize invites wide participation."));
        d5.add(new Prompt(5, 11, "Students test a new skate route across campus and share action clips that generate weekend attention."));
        d5.add(new Prompt(5, 12, "A campus cinema club screens cult classics at an outdoor venue near Capen, posts spike with retro filters."));
        d5.add(new Prompt(5, 13, "A rumor about a pop-up donut stand next to the Student Union spreads anticipation (fictional)."));
        d5.add(new Prompt(5, 14, "A study-abroad alumni meetup posts reunion photos tagging North Campus landmarks."));
        d5.add(new Prompt(5, 15, "A short viral challenge asks students to rate the best coffee chair in the library; participation soars."));
        d5.add(new Prompt(5, 16, "A 'silent disco' event outside the Fine Arts building becomes a weekend hit on short-form platforms."));
        d5.add(new Prompt(5, 17, "Students stage a playful 'slow march' from the Student Union to Capen Hall, documented by dozens."));
        d5.add(new Prompt(5, 18, "An impromptu pop-up tutoring booth near Baldy offers free snacks and gains positive press."));
        d5.add(new Prompt(5, 19, "An iconic campus mural is temporarily covered for restoration, prompting nostalgic posts and memories."));
        d5.add(new Prompt(5, 20, "A creative campus scavenger hunt ends with a hidden menu item at The Commons, sparking foodie shares."));
        PROMPTS_BY_DAY.put(5, Collections.unmodifiableList(d5));

        // Day 6
        List<Prompt> d6 = new ArrayList<>();
        d6.add(new Prompt(6, 1, "A student film shot around North Campus premieres at an on-campus venue and attendees post highlights."));
        d6.add(new Prompt(6, 2, "Campus sustainability award announcement (fictional) credits a student group and prompts congratulations."));
        d6.add(new Prompt(6, 3, "A quirky 'Best Dorm Door' contest circulates, with many entries from North Campus residences."));
        d6.add(new Prompt(6, 4, "A themed pop-up breakfast at The Commons featuring local maple syrup trends results in foodie posts."));
        d6.add(new Prompt(6, 5, "Students host an impromptu poetry slam outside the Arts building that gets reshared by local lit circles."));
        d6.add(new Prompt(6, 6, "A campus-run commuter fair includes discounted meals at nearby cafes, leading to coupon-sharing."));
        d6.add(new Prompt(6, 7, "An alumni chef collaboration at Baldy Hall is posted as an exclusive tasting event, trending briefly."));
        d6.add(new Prompt(6, 8, "Students organize a community paint night in a multipurpose room and photos flood social channels."));
        d6.add(new Prompt(6, 9, "A fictional 'pop quiz' escape room near Capen Hall draws crowds and social media attention."));
        d6.add(new Prompt(6, 10, "A local reporter does a feature on best student-run dining hacks using Commons leftovers (fictional)."));
        d6.add(new Prompt(6, 11, "A viral thread praises the quietest study table near Grosvenor, creating a stampede of seekers."));
        d6.add(new Prompt(6, 12, "Students create a trending 'North Campus sunrise' photo series taken from the pond area."));
        d6.add(new Prompt(6, 13, "A student-run DIY repair clinic near the engineering building gains appreciative mentions."));
        d6.add(new Prompt(6, 14, "A pop-up art walk with small sculptures along the main quad is shared by local arts blogs."));
        d6.add(new Prompt(6, 15, "A community trivia night at the Student Union featuring campus history draws enthusiastic posts."));
        d6.add(new Prompt(6, 16, "A playful 'best late-night snack' poll features Commons tacos and a nearby pizza shop, stirring debate."));
        d6.add(new Prompt(6, 17, "Students stage a lantern walk to celebrate the end of term, with dozens posting serene clips."));
        d6.add(new Prompt(6, 18, "A campus cycling club posts a guide to scenic rides around North Campus, attracting outdoor lovers."));
        d6.add(new Prompt(6, 19, "A campus innovation fair features 3D-printed trinkets made by students; clips are shared widely."));
        d6.add(new Prompt(6, 20, "A popular student-run newsletter publishes a 'weekend guide' to North Campus eateries and events."));
        PROMPTS_BY_DAY.put(6, Collections.unmodifiableList(d6));

        // Day 7
        List<Prompt> d7 = new ArrayList<>();
        d7.add(new Prompt(7, 1, "A large alumni tailgate near the North Campus entrance posts photos of food vendors and campus landmarks."));
        d7.add(new Prompt(7, 2, "A student startup announces a collaboration with The Commons to pilot sustainable packaging (fictional)."));
        d7.add(new Prompt(7, 3, "A heartwarming graduation tribute at Capen Hall is shared with thousands of congratulatory comments."));
        d7.add(new Prompt(7, 4, "The Student Union hosts a creative careers fair that generates LinkedIn posts and local press interest."));
        d7.add(new Prompt(7, 5, "A campus-wide QR treasure hunt ends with a secret menu item at a Commons kiosk, causing a frenzy."));
        d7.add(new Prompt(7, 6, "A viral recipe swap highlights dorm-friendly meals using Commons ingredients, increasing mentions."));
        d7.add(new Prompt(7, 7, "An improv flash mob inside the Student Union is recorded and reshared by campus accounts."));
        d7.add(new Prompt(7, 8, "A trending campus poll ranks North Campus buildings by aesthetic charm, driving playful rivalry."));
        d7.add(new Prompt(7, 9, "A student art installation in the Fine Arts corridor is featured in a popular local arts roundup."));
        d7.add(new Prompt(7, 10, "Campus sustainability club posts a zero-waste lunch experiment at The Commons that draws supportive comments."));
        d7.add(new Prompt(7, 11, "A streaming fundraiser from a study group posts quirky incentives tied to visiting certain North Campus spots."));
        d7.add(new Prompt(7, 12, "A campus pop quiz livestream from Capen Hall attracts online viewership and lively chat engagement."));
        d7.add(new Prompt(7, 13, "A light-hearted rivalry game between dorms is recorded and shared as a feel-good highlight reel."));
        d7.add(new Prompt(7, 14, "A student-run 'best ramen near campus' series names a Commons vendor as a surprise favorite."));
        d7.add(new Prompt(7, 15, "A viral DIY dorm decor tutorial filmed in North Campus housing racks up thousands of views."));
        d7.add(new Prompt(7, 16, "An annual block party (fictional) on the main quad is reimagined with food stalls and live music clips."));
        d7.add(new Prompt(7, 17, "A nostalgic photo series tagging retired professors and North Campus buildings gains traction."));
        d7.add(new Prompt(7, 18, "Students post quick guides to the best nap spots on North Campus after an exhausting finals week."));
        d7.add(new Prompt(7, 19, "A campus trivia livestream awards a Commons dining gift card as a prize and engagement spikes."));
        d7.add(new Prompt(7, 20, "An upbeat montage of campus life around North Campus is compiled by students and shared by alumni pages."));
        PROMPTS_BY_DAY.put(7, Collections.unmodifiableList(d7));
    }

    /**
     * Returns an unmodifiable list of prompts for the given day (1..7). If day is out of range,
     * an empty list is returned.
     */
    public static List<Prompt> getPromptsForDay(int day) {
        return PROMPTS_BY_DAY.getOrDefault(day, Collections.emptyList());
    }

    /**
     * Returns all prompts across all days in day-sorted order.
     */
    public static List<Prompt> getAllPrompts() {
        List<Prompt> all = new ArrayList<>();
        for (int d = 1; d <= 7; d++) {
            all.addAll(PROMPTS_BY_DAY.getOrDefault(d, Collections.emptyList()));
        }
        return Collections.unmodifiableList(all);
    }
}
`